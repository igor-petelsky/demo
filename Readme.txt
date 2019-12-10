Launch main test suite:

1. Open terminal in project's directory.
2. Run command: mvn test

Environment:

- Chromedriver version: 78.0.3904.105 (Chrome with this version should be installed on a PC)
- Mac OS 10.3.13 High Sierra

Notes:

Tests were launched on Mac OS.
To run them on Windows, please do the following:

1. Go to TestBase class
2. Replace setup settings from this:

System.setProperty("webdriver.chrome.driver", mac_os_chrome_driver_path);

to this:

System.setProperty("webdriver.chrome.driver", win_chrome_driver_path);

FYI: I didn't check tests run on Windows

