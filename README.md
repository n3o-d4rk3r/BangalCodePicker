# BangalCodePicker - Only BD, IN, UK, US Country Picker
#### Add it in your root build.gradle at the end of repositories:
<br>

### Update Project(settings.gradle):

<pre>pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}</pre>


### Old Project:
<pre>	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}</pre>
  
  ### <h2>Step 2.</h2> Add the dependency
  
  <pre>	dependencies {
	          implementation 'com.github.n3o-d4rk3r:BangalCodePicker:1.0'
	}</pre>

