package formDomain;

import java.util.ArrayList;
import java.util.List;

public class RowList {
	List<Row> rowList;
	
	

	public RowList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int size() {
		return this.rowList.size();
	}
	
	public void add(Row row) {
		this.rowList.add(row);
	}

	public RowList(List<Row> rowList) {
		super();
		this.rowList = rowList;
	}

	public List<Row> getRowList() {
		return rowList;
	}

	public void setRowList(List<Row> rowList) {
		this.rowList = rowList;
	}

	
	
	
}
