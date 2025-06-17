package formDomain;

import java.util.List;

public class TestRowsList {
	List<TestRows> rowsList;

	public TestRowsList(List<TestRows> testRowsList) {
		super();
		this.rowsList = testRowsList;
	}

	public TestRowsList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int size() {
		return this.rowsList.size();
	}
	
	public void add(TestRows testRows) {
		this.rowsList.add(testRows);
	}

	public List<TestRows> getTestRowsList() {
		return rowsList;
	}

	public void setTestRowsList(List<TestRows> testRowsList) {
		this.rowsList = testRowsList;
	}

	
}
