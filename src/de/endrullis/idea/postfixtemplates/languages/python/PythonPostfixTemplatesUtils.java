package de.endrullis.idea.postfixtemplates.languages.python;

import com.intellij.openapi.util.Condition;
import com.intellij.psi.PsiElement;
import com.jetbrains.python.psi.PyExpression;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Utilities for Python postfix templates.
 *
 * @author Stefan Endrullis &lt;stefan@endrullis.de&gt;
 */
class PythonPostfixTemplatesUtils {

	/*
	@NotNull
	static Condition<PsiElement> isCustomClass(String clazz) {
		return element -> element instanceof PyExpression && isCustomClass(((SqlExpression) element).getSqlType(), clazz.toLowerCase());
	}

	private static boolean isCustomClass(SqlType sqlType, String type) {
		return StringUtils.substringBefore(sqlType.getDisplayName(), "(").equals(type);
	}

	static Condition<PsiElement> isCategory(SqlType.Category category) {
		return element -> element instanceof SqlExpression && ((SqlExpression) element).getSqlType().getCategory().equals(category);
	}
	*/

}
