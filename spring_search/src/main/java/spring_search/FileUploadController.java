package spring_search;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/uform")
	public String uform() {
		
		//throw Null Pointer Exception
		String str = null;
		System.out.println(str.charAt(0));
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String uploadimage(@RequestParam("profile") CommonsMultipartFile file,HttpSession s, Model m) {
		System.out.println("file upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
		//we save this file on server...
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator
				+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("File Uploaded!");
		m.addAttribute("msg", "uploaded successfully!");
		m.addAttribute("filename", file.getOriginalFilename());
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Uploading Error!");
			m.addAttribute("msg", "Uploading Error!");
		}
		return "filesuccess";
	}
}



//deploy path
//F:\Spring Concepts\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\wtpwebapps\spring_search\WEB-INF\resources\images\PRM50KB.jpg




