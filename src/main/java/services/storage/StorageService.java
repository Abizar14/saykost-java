package services.storage;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;

public class StorageService {

	/**
	 * This method uploads an image file to {@code ./img/upload/} folder and
	 * returns the path of the uploaded image.
	 *
	 * @param imageFile         The file to be uploaded.
	 * @param boardingHouseName The name of the boarding house.
	 * @return The path of the uploaded image, or null if an error occurs.
	 */
	public static @Nullable String uploadImage(File imageFile, String boardingHouseName) {
		File destinationFolder = new File("./img/upload");

		if (!destinationFolder.exists()) {
			destinationFolder.mkdir();
		}
//
////		check if file already exists
//		File destinationFile = new File(destinationFolder, imageFile.getName());
//		if (destinationFile.exists()) {
//			System.out.println("Image not Updated" + destinationFile);
//			return "./img/upload/" + imageFile.getName();
//		}


		String uniqueFileName = boardingHouseName + "-" + new Date().getTime() + "-" + imageFile.getName();
		Path destinationFilePath = destinationFolder.toPath().resolve(uniqueFileName);

		try {
			Files.copy(imageFile.toPath(), destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(destinationFilePath);
			return "./img/upload/" + uniqueFileName;
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	//	update image method, if image doesnt change and exist, it will not update, if image changes, it will delete old image and upload new
	public static @Nullable String updateImage(File imageFile, String imagePath, String boardingHouseName) {
		if (imageFile.exists() && !imagePath.equals("./img/upload/" + imageFile.getName())) {
			deleteImage(imagePath);
			return uploadImage(imageFile, boardingHouseName);
		} else {
			return imagePath;
		}
	}

	public static String deleteImage(String imagePath) {
		File imageFile = new File(imagePath);
		if (imageFile.exists()) {
			imageFile.delete();
		}
		return imagePath;
	}

}
