package jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.4 实战:OutOfMemeryError异常</br>
 * 
 * JVM arguments: -verboss:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemeryError
 * @author MR_D
 *
 */
public class OutOfMemeryError {
	public static void main(String[] args) {
		System.out.println("start test...");
		
		heapError();
	}
	
	static class OOMObject {}
	
	/**
	 * 2.4.1 Java堆溢出
	 */
	private static void heapError() {
		List<OOMObject> list = new ArrayList<>();
		while(true) {
			list.add(new OOMObject());
		}
	}
}
