grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		mavenLocal()
		grailsCentral()
		mavenCentral()
	}

	dependencies {
		String jettyVersion = '9.3.23.v20180228'
		compile 'org.eclipse.jetty.aggregate:jetty-all:pom:' + jettyVersion

		String tomcatVersion = '9.0.0.M4'
		compile "org.apache.tomcat.embed:tomcat-embed-core:$tomcatVersion", {
			export = false
		}
	}

	plugins {
		build ':release:3.1.2', ':rest-client-builder:2.1.1', {
			export = false
		}
	}
}
