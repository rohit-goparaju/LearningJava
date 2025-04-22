package com.learningJava.learningJava;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FolderCleaner {

	public static final Logger log = LoggerFactory.getLogger(FolderCleaner.class);

	public static void cleanEmptyFolders(String parentPath,boolean deleteParentIfEmpty) {
		File parentDir = new File(parentPath);
		if(parentDir.isDirectory()) {
			if(deleteParentIfEmpty) {
				cleanEmptyFolders(parentDir);
			}else {
				File[] children = parentDir.listFiles();
				for(File child : children) {
					cleanEmptyFolders(child);
				}	
			}
		}
		else {
			try {
				log.warn(parentDir.getCanonicalPath() + " is not a directory");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void cleanEmptyFolders(File parentDir) {
		if(parentDir.isDirectory()) {
			File[] children = parentDir.listFiles();

			for(File child : children) {
				if(child.isDirectory())
					cleanEmptyFolders(child);
			}

			if(parentDir.list().length == 0) {
				try {
					log.info("deleting " + parentDir.getCanonicalPath() + ", status: " + parentDir.delete());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
