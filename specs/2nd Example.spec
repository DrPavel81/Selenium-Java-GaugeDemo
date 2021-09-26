2nd Example
===========
* go to "http://automationpractice.com/index.php"

Online shopping process
-----------------------
* move mouse to location by class name "sf-with-ul"
* click hyperlink "T-shirts"
* wait until element is present by id "center_column"
* move mouse to location by class name "product_img_link"
* click hyperlink "Quick view"
* wait "5" seconds
* focus on frame by tag name "iframe"
* click button by id "add_to_cart"
* move focus back to main page
* wait "5" seconds
* click hyperlink "Proceed to checkout"
* wait "5" seconds
* click hyperlink "Proceed to checkout"
* insert text "testerAddress@gmail.com" by id "email"
* insert text "testerAddress" by id "passwd"
* click button by id "SubmitLogin"
* insert text "test order" by name "message"
* click button by name "processAddress"
* click button by id "cgv"
* click button by name "processCarrier"
* click hyperlink "Pay by bank wire"
* click element by xpath "//*[@id='cart_navigation']/button"
* check order reference