package com.test.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	public final String UPLOAD_DIR="E:\\java\\JavaProject\\springbootrest\\src\\main\\resources\\static\\documents";
	public boolean uploadFile(MultipartFile multiFile) {
		boolean f = false;
		try {
			InputStream is = multiFile.getInputStream();
			byte data[] = new byte[is.available()];
			is.read(data);
			//write 
			FileOutputStream fout = new FileOutputStream(UPLOAD_DIR+File.separator+multiFile.getOriginalFilename());
			fout.write(data);
			fout.flush();
			fout.close();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
