package formDomain;

import java.text.DateFormat;

public record FormDTO( String numberForm, String campo1, String campo2, DateFormat data1, DateFormat data2) {
	/*
	public void ProductDTO(FormValidate f) {
		this( f.getNumberForm(), f.getCampo1(), f.getCampo2(), f.getData1(), f.getData2());
	}
	*/
}
