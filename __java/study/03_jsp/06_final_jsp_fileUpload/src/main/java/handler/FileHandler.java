package handler;

import java.io.File;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileHandler {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(FileHandler.class);

	public int deleteFile(String imageFileName, String savePath) {
		log.info(">>> check 2");
		
		log.info(">>> savePath > {}", savePath);
		File fileDir = new File(savePath);

		File removeFile = new File(fileDir + File.separator + imageFileName);
		File removeThumbFile = new File(fileDir + File.separator + "th_" + imageFileName);

		boolean isDel = true;
		if (removeFile.exists() || removeThumbFile.exists()) {
			isDel = removeFile.delete();
			log.info(">>> FileHandler Remove {}", isDel ? "OK" : "Fail");
			if (isDel) {
				isDel = removeThumbFile.delete();
				log.info(">>> FileHandler Remove Thumbnail {}", isDel ? "OK" : "Fail");
			}
		}
		log.info(">>> check 3");
		return isDel ? 1 : 0;
	}

}
