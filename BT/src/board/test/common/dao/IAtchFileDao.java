package board.test.common.dao;

import java.sql.SQLException;
import java.util.List;

import board.test.common.vo.AtchFileVO;


public interface IAtchFileDao {

	public int insertAtchFile(AtchFileVO atchFileVO) throws SQLException;

	public int insertAtchFileDetail(AtchFileVO atchFileVO) throws SQLException;

	public List<AtchFileVO> getAtchFileList(AtchFileVO fileVO) throws SQLException;

	public AtchFileVO getAtchFileDetail (AtchFileVO atchFileVO) throws SQLException;
}





