package formDomain;

import java.text.DateFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "products")
public class FormValidate {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String numberForm;
	
	public String campo1;
	
	public String campo2;
	
	public DateFormat data1;
	
	public DateFormat data2;
	

	public FormValidate() {
		super();
	}

	public FormValidate(String campo1, String campo2, DateFormat data1, DateFormat data2) {
		super();
		this.campo1 = campo1;
		this.campo2 = campo2;
		this.data1 = data1;
		this.data2 = data2;
	}
	
	

	public String getNumberForm() {
		return numberForm;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public String getCampo2() {
		return campo2;
	}

	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	public DateFormat getData1() {
		return data1;
	}

	public void setData1(DateFormat data1) {
		this.data1 = data1;
	}

	public DateFormat getData2() {
		return data2;
	}

	public void setData2(DateFormat data2) {
		this.data2 = data2;
	}
	
	
}
