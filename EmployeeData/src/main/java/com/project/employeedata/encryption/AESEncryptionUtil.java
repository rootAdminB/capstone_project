package com.project.employeedata.encryption;

/**
 *@author NareshBabu O
 *@created Date23-Apr-2023
*
 */

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

public class AESEncryptionUtil {

	public static final String ALG = "AES";
	public static final String PASSWORD = "EmployeeEncryption@123";

	private static TextEncryptor textEncryptor = Encryptors.text(ALG, PASSWORD);

	public static String encrypt(String input) {
		return textEncryptor.encrypt(input);
	}

	public static String decrypt(String encryptedInput) {
		return textEncryptor.decrypt(encryptedInput);
	}

}
