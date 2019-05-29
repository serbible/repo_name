package org.zerock.sample;
//56
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

//@Setter: setChef()컴파일시 생성
	//onMethod_ : setChef()에 @Autowired추가
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
}
//onMethod_ :에러가 뜨는 경우에(eclipse.ini) 아래 부분을 추가할것
//-vmargs -javaagent:lombok.jar
//-javaagent:C:\Users\choongan402\eclipse\jee-2019-03\eclipse\lombok.jar*/




/*-startup
plugins/org.eclipse.equinox.launcher_1.5.300.v20190213-1655.jar
--launcher.library
C:\Users\choongan402\.p2\pool\plugins\org.eclipse.equinox.launcher.win32.win32.x86_64_1.1.1000.v20190125-2016
-product
org.eclipse.epp.package.jee.product
-showsplash
org.eclipse.epp.package.common
--launcher.defaultAction
openFile
--launcher.appendVmargs
-vm
C:/Program Files/Java/jdk1.8.0_211/bin/javaw.exe
-vmargs -javaagent:lombok.jar   
-vmargs
-Dosgi.requiredJavaVersion=1.8
-Dosgi.instance.area.default=@user.home/eclipse-workspace
-XX:+UseG1GC
-XX:+UseStringDeduplication
--add-modules=ALL-SYSTEM
-Dosgi.requiredJavaVersion=1.8
-Dosgi.dataAreaRequiresExplicitInit=true
-Xms256m
-Xmx1024m
--add-modules=ALL-SYSTEM
-Declipse.p2.max.threads=10
-Doomph.update.url=http://download.eclipse.org/oomph/updates/milestone/latest
-Doomph.redirection.index.redirection=index:/->http://git.eclipse.org/c/oomph/org.eclipse.oomph.git/plain/setups/
-javaagent:C:\Users\choongan402\eclipse\jee-2019-03\eclipse\lombok.jar*/