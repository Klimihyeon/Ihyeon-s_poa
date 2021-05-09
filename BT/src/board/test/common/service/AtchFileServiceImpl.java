package board.test.common.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.fileupload.FileItem;

import board.test.common.dao.AtchFileDaoImpl;
import board.test.common.dao.IAtchFileDao;
import board.test.common.vo.AtchFileVO;
import board.test.util.FileUploadRequestWrapper;

public class AtchFileServiceImpl implements IAtchFileService {
	
	private static IAtchFileService fileService;
	private IAtchFileDao fileDao;
	
	private AtchFileServiceImpl() {
		fileDao = AtchFileDaoImpl.getInstance();
	}
	
	public static IAtchFileService getInstance() {
		if(fileService == null) {
			fileService = new AtchFileServiceImpl();
		}
		
		return fileService;
	}
	
	@Override
	public AtchFileVO saveAtchFile(FileItem item) throws Exception {
		
		File uploadDir = 
			new File(FileUploadRequestWrapper.UPLOAD_DIRECTORY);
		if(!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		
		String orignFileName = 
				new File(item.getName()).getName();
		
		long fileSize = item.getSize();
		String storeFileName = "";
		String filePath = "";
		File storeFile = null;
		
		do {
			storeFileName = UUID.randomUUID()
					.toString().replace("-", "");
			filePath = FileUploadRequestWrapper.UPLOAD_DIRECTORY
					+ File.separator + storeFileName;
			storeFile = new File(filePath);
		}while(storeFile.exists()); 
		
		String fileExtension =orignFileName
				.lastIndexOf(".") < 0 ? "" 
					: orignFileName
					.substring(orignFileName
							.lastIndexOf(".") + 1);
		
		item.write(storeFile);
		
		AtchFileVO atchFileVO = new AtchFileVO();
		
		fileDao.insertAtchFile(atchFileVO);
		
		atchFileVO.setStreFileNm(storeFileName);
		atchFileVO.setFileSize(fileSize);
		atchFileVO.setOrignlFileNm(orignFileName);
		atchFileVO.setFileStreCours(filePath);
		atchFileVO.setFileExtsn(fileExtension);
		
		fileDao.insertAtchFileDetail(atchFileVO);
		
		item.delete();
		
		return atchFileVO;
	}

	@Override
	public AtchFileVO saveAtchFileList(Map<String, Object> fileItemMap) throws Exception {
		return null;
	}

	@Override
	public List<AtchFileVO> getAtchFileList(AtchFileVO fileVO) throws SQLException {
		return fileDao.getAtchFileList(fileVO);
	}

	@Override
	public AtchFileVO getAtchFileDetail(AtchFileVO fileVO) throws SQLException {
		return fileDao.getAtchFileDetail(fileVO);
	}

}
