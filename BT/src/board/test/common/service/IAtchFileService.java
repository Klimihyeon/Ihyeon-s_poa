package board.test.common.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.fileupload.FileItem;

import board.test.common.vo.AtchFileVO;


public interface IAtchFileService {

	public AtchFileVO saveAtchFile (FileItem item) throws Exception;

	public AtchFileVO saveAtchFileList (Map<String, Object> fileItemMap) throws Exception;

	public List<AtchFileVO> getAtchFileList(AtchFileVO fileVO) throws SQLException;

	public AtchFileVO getAtchFileDetail(AtchFileVO fileVO) throws SQLException;

}





