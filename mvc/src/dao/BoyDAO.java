package dao;

import vo.BoyVO;

public class BoyDAO {
	public BoyVO setModel(String line) {
		String[] datas = line.split("\t");
		BoyVO boyVO = new BoyVO();
		boyVO.setName(datas[0]);
		boyVO.setRanking(Integer.valueOf(datas[1]));
		boyVO.setPopulation(Integer.valueOf(removeComma(datas[2])));
		
		return boyVO;
	}
	
	public String removeComma(String data) {
		return data.replaceAll(",", "");
	}
}
