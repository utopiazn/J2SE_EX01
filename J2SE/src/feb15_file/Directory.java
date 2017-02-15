package feb15_file;

public class Directory {
	private String directoryName;
	public Directory(String folderName){
		this.directoryName = folderName;
	}
	public String getDirectoryName() {
		return directoryName;
	}
	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}
	public String toString(){
		return directoryName;
	}	

}
