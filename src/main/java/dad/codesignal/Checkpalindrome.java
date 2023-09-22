package dad.codesignal;

public class Checkpalindrome {
	boolean solution(String inputString) {
		 int left = 0;
		 int right = inputString.length() - 1;
		 while (left < right) {
		 if (inputString.charAt(left) != inputString.charAt(right)) {
		 return false; // Si los caracteres en los extremos no coinciden, no es un palíndromo
		 }
		 left++;
		 right--;
		 }
		 return true; // Si llegamos aquí, la cadena es un palíndromo
		}

}
