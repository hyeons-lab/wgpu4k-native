
allprojects {

	repositories {
		mavenLocal()
		google()
		mavenCentral()
	}

	group = "com.hyeons-lab"
	version = System.getenv("VERSION")?.takeIf { it.isNotBlank() } ?: "v27.0.4-SNAPSHOT"
}


