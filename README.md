# BangalCodePicker-Only BD, IN, UK, US Country Picker
### Add it in your root build.gradle at the end of repositories:

### Update Project(settings.gradle):

<p dir="auto">Step 1. Add it in your root <b>settings.gradle</b> at the end of repositories:</p>
<div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate"><code>pluginManagement {
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
}
</code></pre><div class="zeroclipboard-container position-absolute right-0 top-0">
    <clipboard-copy aria-label="Copy" class="ClipboardButton btn js-clipboard-copy m-2 p-0 tooltipped-no-delay" data-copy-feedback="Copied!" data-tooltip-direction="w" value="pluginManagement {
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
}" tabindex="0" role="button">
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-copy js-clipboard-copy-icon m-2">
    <path fill-rule="evenodd" d="M0 6.75C0 5.784.784 5 1.75 5h1.5a.75.75 0 010 1.5h-1.5a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-1.5a.75.75 0 011.5 0v1.5A1.75 1.75 0 019.25 16h-7.5A1.75 1.75 0 010 14.25v-7.5z"></path><path fill-rule="evenodd" d="M5 1.75C5 .784 5.784 0 6.75 0h7.5C15.216 0 16 .784 16 1.75v7.5A1.75 1.75 0 0114.25 11h-7.5A1.75 1.75 0 015 9.25v-7.5zm1.75-.25a.25.25 0 00-.25.25v7.5c0 .138.112.25.25.25h7.5a.25.25 0 00.25-.25v-7.5a.25.25 0 00-.25-.25h-7.5z"></path>
</svg>
      <svg aria-hidden="true" height="16" viewBox="0 0 16 16" version="1.1" width="16" data-view-component="true" class="octicon octicon-check js-clipboard-check-icon color-fg-success d-none m-2">
    <path fill-rule="evenodd" d="M13.78 4.22a.75.75 0 010 1.06l-7.25 7.25a.75.75 0 01-1.06 0L2.22 9.28a.75.75 0 011.06-1.06L6 10.94l6.72-6.72a.75.75 0 011.06 0z"></path>
</svg>
    </clipboard-copy>
  </div></div>


### Old Project:
<pre>	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}</pre>
  
  ### <h2>Step 2.</h2> Add the dependency
  
  <pre>dependencies {
	          implementation 'com.github.n3o-d4rk3r:BangalCodePicker:1.0'
	}</pre>






### Tags:
<div class="my-3">
      <div class="f6">
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:android" href="/topics/android" title="Topic: android" data-view-component="true" class="topic-tag topic-tag-link">
  android
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:library-android" href="/topics/library-android" title="Topic: library-android" data-view-component="true" class="topic-tag topic-tag-link">
  library-android
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:bangal-code-picker" href="/topics/bangal-code-picker" title="Topic: bangal-code-picker" data-view-component="true" class="topic-tag topic-tag-link">
  bangal-code-picker
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:bd-in-uk-us" href="/topics/bd-in-uk-us" title="Topic: bd-in-uk-us" data-view-component="true" class="topic-tag topic-tag-link">
  bd-in-uk-us
</a>
      <a data-ga-click="Topic, repository page" data-octo-click="topic_click" data-octo-dimensions="topic:bd-in-us--uk-android-library" href="/topics/bd-in-us--uk-android-library" title="Topic: bd-in-us--uk-android-library" data-view-component="true" class="topic-tag topic-tag-link">
  bd-in-us--uk-android-library
</a>
  </div>

  </div>
