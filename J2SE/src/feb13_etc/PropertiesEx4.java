package feb13_etc;

import java.util.*;
import static java.lang.System.out;

public class PropertiesEx4 {
	
	public static void main(String[] args){
		
		Properties sysProp = System.getProperties();
		
		out.println("java.version :"+ sysProp.getProperty("java.version"));
		out.println("user.languag :"+ sysProp.getProperty("user.language"));
		sysProp.list(out);
	}

}
/*
java.version :1.8.0_121
user.languag :ko
-- listing properties --
java.runtime.name=Java(TM) SE Runtime Environment
sun.boot.library.path=C:\Program Files\Java\jre1.8.0_121\bin
java.vm.version=25.121-b13
java.vm.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
path.separator=;
java.vm.name=Java HotSpot(TM) 64-Bit Server VM
file.encoding.pkg=sun.io
user.script=
user.country=KR
sun.java.launcher=SUN_STANDARD
sun.os.patch.level=Service Pack 1
java.vm.specification.name=Java Virtual Machine Specification
user.dir=C:\Java\JavaGit\J2SE_EX01\J2SE
java.runtime.version=1.8.0_121-b13
java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment
java.endorsed.dirs=C:\Program Files\Java\jre1.8.0_121\li...
os.arch=amd64
java.io.tmpdir=C:\Users\zn\AppData\Local\Temp\
line.separator=

java.vm.specification.vendor=Oracle Corporation
user.variant=
os.name=Windows 7
sun.jnu.encoding=MS949
java.library.path=C:\Program Files\Java\jre1.8.0_121\bi...
java.specification.name=Java Platform API Specification
java.class.version=52.0
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
os.version=6.1
user.home=C:\Users\zn
user.timezone=
java.awt.printerjob=sun.awt.windows.WPrinterJob
file.encoding=UTF-8
java.specification.version=1.8
user.name=zn
java.class.path=C:\Java\JavaGit\J2SE_EX01\J2SE\bin
java.vm.specification.version=1.8
sun.arch.data.model=64
java.home=C:\Program Files\Java\jre1.8.0_121
sun.java.command=feb13_etc.PropertiesEx4
java.specification.vendor=Oracle Corporation
user.language=ko
awt.toolkit=sun.awt.windows.WToolkit
java.vm.info=mixed mode
java.version=1.8.0_121
java.ext.dirs=C:\Program Files\Java\jre1.8.0_121\li...
sun.boot.class.path=C:\Program Files\Java\jre1.8.0_121\li...
java.vendor=Oracle Corporation
file.separator=\
java.vendor.url.bug=http://bugreport.sun.com/bugreport/
sun.cpu.endian=little
sun.io.unicode.encoding=UnicodeLittle
sun.desktop=windows
sun.cpu.isalist=amd64

*/