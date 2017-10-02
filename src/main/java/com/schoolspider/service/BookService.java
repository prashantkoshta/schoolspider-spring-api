package com.schoolspider.service;

import java.util.List;
import com.schoolspider.model.Terms;

public interface BookService {
	List<Terms> getTerms(String s_class);
	List<Terms> getSClass(int school_id);
}
