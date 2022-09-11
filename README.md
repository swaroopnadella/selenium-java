# Selenium Java Framework Basic concepts

1) Handle Shadow DOM elements
- Shadow DOM elements in the HTML DOM structure under tagname "#shadow-root"
- Shadow-root elements can be accessed if the "(open)" is present beside shadow-root. If it is "(closed)", we cannot access the shadow-root elements.
- using locators like Id, Xpath, Css etc., won't work while automating with Selenium.
- We have to use the JavascriptExecutor to work on the shadow-root elements.
