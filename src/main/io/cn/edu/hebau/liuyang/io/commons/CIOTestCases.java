package cn.edu.hebau.liuyang.collection.commons;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.junit.Test;

public class CIOTestCases {
	
	
	/**
	 * 统计文件以及目录的大小
	 */
	@Test
	public void testFileAndFolderSize() {
		String FILE_PATH = "F:\\workspaces\\workspace_oxygen/TestJavaExtension/src/main/collections/cn/edu/hebau/liuyang/collection/commons/CIOTestCases.java";
		String FOLDER_PATH = "F:\\workspaces\\workspace_oxygen/TestJavaExtension/src";
		
		long length = FileUtils.sizeOf(new File(FILE_PATH));// 文件
		System.out.println("file size = " + length);
		length = FileUtils.sizeOf(new File(FOLDER_PATH));// 文件夹
		System.out.println("folder size = " + length);
	}

	/**
	 * 列出子孙级
	 */
	@Test
	public void testListChildren() {
		String FOLDER_PATH = "F:/workspaces/workspace_oxygen/TestJavaExtension";
		Collection<File> files = FileUtils.listFiles(new File(FOLDER_PATH), EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
}
