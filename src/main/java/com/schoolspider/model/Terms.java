package com.schoolspider.model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "BOOKS")
public class Terms  implements Serializable {
			
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer book_id;
	
	@NotNull
    private String s_class;
	
	@NotNull
    private String s_class_title;
	
    @NotNull
    private String term;
    
    @NotNull
    private String term_title;

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public String getS_class() {
		return s_class;
	}

	public void setS_class(String s_class) {
		this.s_class = s_class;
	}

	public String getS_class_title() {
		return s_class_title;
	}

	public void setS_class_title(String s_class_title) {
		this.s_class_title = s_class_title;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getTerm_title() {
		return term_title;
	}

	public void setTerm_title(String term_title) {
		this.term_title = term_title;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

	
    
    

    

}