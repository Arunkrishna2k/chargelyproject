package Merchant.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Landing  extends Merchant.sub.Baseclass{	

@Given("user can lanuch the url")
public void user_can_lanuch_the_url() {


WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chargely.com/");
System.out.println("sucessfully shown the website page");
}

@When("user can click the subscription button")
public void user_can_click_the_subscription_button() throws InterruptedException {
	WebElement subscription = driver.findElement(By.xpath("//a[text( )=' Subscription Buttons ']"));
	  Thread.sleep(1000);
	  subscription.click();
		System.out.println("sucessfully user can click the subscription button");
}

@When("user can click the plugin buttton")
public void user_can_click_the_plugin_buttton() throws InterruptedException {
	WebElement plugin = driver.findElement(By.xpath("//a[text( )=' Plugins ']"));
	  Thread.sleep(1000);
	  plugin.click();
	  System.out.println("sucessfully user can click the plugin button");
}

@When("user can click the features")
public void user_can_click_the_features() throws InterruptedException {
	WebElement feature = driver.findElement(By.xpath("//a[text( )=' Features ']"));
	  Thread.sleep(1000);
	  feature.click();
		System.out.println("sucessfully user_can_click_the_feature_button");
}
@When("user can click the payment tool")
public void user_can_click_the_payment_tool() throws InterruptedException {
	WebElement payment = driver.findElement(By.xpath("//a[text( )=' Payment Tools ']"));
	  Thread.sleep(1000);
	  payment.click();
		System.out.println("sucessfully user can click the payment tool");
}

@When("user can click the what is chargely")
public void user_can_click_the_what_is_chargely() throws InterruptedException {
	WebElement chargely = driver.findElement(By.xpath("//label[text( )='What is chargely?']"));
	  Thread.sleep(1000);
	  chargely.click();
		System.out.println("sucessfully user can click the what is chargely");
}

@When("user can click the how does it works")
public void user_can_click_the_how_does_it_works() throws InterruptedException {
	WebElement works = driver.findElement(By.xpath("//label[text( )='How does it works?']"));
	  Thread.sleep(1000);
	  works.click();
		System.out.println("sucessfully user can click the how does it works");
}

@When("user can click the is chargely safe to use?")
public void user_can_click_the_is_chargely_safe_to_use() throws InterruptedException {
	WebElement safe = driver.findElement(By.xpath("//label[text( )='Is chargely safe to use?']"));
	  Thread.sleep(1000);
	  safe.click();
		System.out.println("sucessfully user can click the is chargely safe to use?");
}

@When("user can click the do i need webside to use chargely")
public void user_can_click_the_do_i_need_webside_to_use_chargely() throws InterruptedException {
	WebElement webside = driver.findElement(By.xpath("//label[text( )='Is chargely safe to use?']"));
	  Thread.sleep(1000);
	  webside.click();
		System.out.println("sucessfully click the do i need webside to use chargely");
}

// NEED TO CHANGE AFTER TEST
@When("user can enter your email address {string}")
public void user_can_enter_your_email_address(String string) throws InterruptedException {
	WebElement address = driver.findElement(By.id("landing-page-component-24"));
	  Thread.sleep(1000);
	  address.sendKeys("thara@gmail.com");
		System.out.println("sucessfully user can enter your email address");
}

@When("user can click the start free trial button")
public void user_can_click_the_start_free_trial_button() throws InterruptedException {
	WebElement free = driver.findElement(By.id("landing-page-component-25"));
	  Thread.sleep(1000);
	  free.click();
		System.out.println("sucessfully user can click the start free trial button");
}

@When("user can enter your password {string}")
public void user_can_enter_your_password(String string) throws InterruptedException {
	WebElement password = driver.findElement(By.id("register-id-3"));
	  Thread.sleep(1000);
	  password.sendKeys("Arunjaya1@");
		System.out.println("user can enter your password");
}

@When("user can enter your business name")
public void user_can_enter_your_business_name() throws InterruptedException {
	WebElement business = driver.findElement(By.id("register-id-5"));
	  Thread.sleep(1000);
	  business.sendKeys("Arunjaya");
		System.out.println("user can enter your business name");
}

@When("user can click the create an account")
public void user_can_click_the_create_an_account() throws InterruptedException {
	WebElement account = driver.findElement(By.id("register-id-6"));
	  Thread.sleep(1000);
	  account.click();
		System.out.println("user can click the create an account");

}

@Given("user can click the free plan  button")
public void user_can_click_the_free_plan_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement freeplan = driver.findElement(By.id("startfreetrial"));


 freeplan.click();
}

@When("user can click the signout button")
public void user_can_click_the_signout_button() throws InterruptedException {
	Thread.sleep(1000);
	WebElement signout = driver.findElement(By.xpath("//div[text( )=' Sign Out ']"));


  signout.click();
}

@When("user can click the privacy policy")
public void user_can_click_the_privacy_policy() throws InterruptedException {
	Thread.sleep(3000);
	WebElement privacy = driver.findElement(By.xpath("//a[text( )=' Privacy Policy ']"));


  privacy.click();
}

@Then("user can click the terms of use")
public void user_can_click_the_terms_of_use() throws InterruptedException {
	Thread.sleep(3000);
    WebElement terms =driver.findElement(By.xpath("//a[text( )=' Terms of use ']"));
    terms.click();
}

@Then("user can clcik the chargely logo")
public void user_can_clcik_the_chargely_logo() throws InterruptedException {
	WebElement logo =driver.findElement(By.xpath("//img[@alt='chargely']"));
	Thread.sleep(3000);
	logo.click();
}

@Given("user can click the login button")
public void user_can_click_the_login_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement login =driver.findElement(By.id("landing-page-component-17"));


login.click();
}

@When("user can enter the email")
public void user_can_enter_the_email() throws InterruptedException {
	Thread.sleep(3000);
	WebElement email =driver.findElement(By.id("login-id-13"));


email.sendKeys("rupacandy01@gmail.com");
}

@When("user can enter the password")
public void user_can_enter_the_password() throws InterruptedException {
	Thread.sleep(3000);
	WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));


pass.sendKeys("Nakshatran01@");
}

@When("user can click the Login")
public void user_can_click_the_login() throws InterruptedException {
	Thread.sleep(3000);
	WebElement Login =driver.findElement(By.xpath("//button[text( )='Login']"));
	Login.click();
}

@When("user can click the transcation")
public void user_can_click_the_transcation() throws InterruptedException {
	Thread.sleep(5000);
	WebElement transcation =driver.findElement(By.id("dashboard-id-3"));	
	transcation.click();
}

@When("user can click the customer")
public void user_can_click_the_customer() throws InterruptedException {
	Thread.sleep(5000);
	WebElement customer =driver.findElement(By.id("dashboard-id-4"));
	customer.click();
}

@When("user can click the analytics")
public void user_can_click_the_analytics() throws InterruptedException {
	Thread.sleep(5000);
	WebElement analytics =driver.findElement(By.id("dashboard-id-5"));


analytics.click();
}

@When("user can click the reports")
public void user_can_click_the_reports() throws InterruptedException {
	Thread.sleep(3000);
	WebElement reports =driver.findElement(By.id("dashboard-id-6"));


reports.click();
}

@When("user can click the settings")
public void user_can_click_the_settings() throws InterruptedException {
	Thread.sleep(3000);
	WebElement settings =driver.findElement(By.id("dashboard-id-7"));


settings.click();
}

@When("user can click the my site")
public void user_can_click_the_my_site() throws InterruptedException {
	Thread.sleep(3000);
	WebElement mysite =driver.findElement(By.id("dashboard-id-8"));
	mysite.click();
}

@When("user can click the plan")
public void user_can_click_the_plan() throws InterruptedException {
	Thread.sleep(3000);
	WebElement plan =driver.findElement(By.id("dashboard-id-9"));
	plan.click();
}

@When("user can click the create plan")
public void user_can_click_the_create_plan() throws InterruptedException {
	Thread.sleep(3000);
	WebElement createplan =driver.findElement(By.xpath("//a[text( )='Create Plan']"));
	createplan.click();
}

// USER NEED TO  CHANGE THE PLAN NAME
@When("user can enter the plan name")
public void user_can_enter_the_plan_name() throws InterruptedException {
	Thread.sleep(3000);
	WebElement createname =driver.findElement(By.xpath("//input[@formcontrolname='name']"));


createname.sendKeys("ArunniRSHNA");
}

@When("user can enter the description")
public void user_can_enter_the_description() throws InterruptedException {
	Thread.sleep(3000);
	WebElement description =driver.findElement(By.xpath("//input[@formcontrolname='description']"));


description.sendKeys("DS");
}

@When("user can click the add specification")
public void user_can_click_the_add_specification() throws InterruptedException {
	Thread.sleep(3000);
	WebElement specification =driver.findElement(By.xpath("//span[@class='fs-14 pr-10']"));


specification.click();
}

@When("user can enter the free trail")
public void user_can_enter_the_free_trail() throws InterruptedException {
	Thread.sleep(3000);
	WebElement freetrail =driver.findElement(By.xpath("//input[@formcontrolname='trial_period']"));


freetrail.sendKeys("80");
}

@When("user can enter the billing period")
public void user_can_enter_the_billing_period() throws InterruptedException {
	Thread.sleep(3000);
	WebElement billingperiod =driver.findElement(By.xpath("//input[@formcontrolname='billing_period']"));


billingperiod.sendKeys("2");
}

@When("user can select the billing type")
public void user_can_select_the_billing_type() throws InterruptedException {
	Thread.sleep(3000);
	WebElement billingtype =driver.findElement(By.xpath("//option[@value='month']"));


billingtype.click();
}

@When("user can select the currency type")
public void user_can_select_the_currency_type() throws InterruptedException {
	Thread.sleep(3000);
	WebElement currency =driver.findElement(By.xpath("//option[@value='gbp']"));


currency.click();
}

@When("user can enter the princing details")
public void user_can_enter_the_princing_details() throws InterruptedException {
	Thread.sleep(3000);
	WebElement princing =driver.findElement(By.xpath("//input[@formcontrolname='amount']"));


princing.sendKeys("70");
}

@When("user can enter the cancel url")
public void user_can_enter_the_cancel_url() throws InterruptedException {
	Thread.sleep(3000);
	WebElement cancel =driver.findElement(By.xpath("//input[@formcontrolname='cancel_url']"));


cancel.sendKeys("<https://chargely.com/merchant/create/plan");
}

@When("user can enter the redirect url")
public void user_can_enter_the_redirect_url() throws InterruptedException {
	Thread.sleep(3000);
	WebElement redirect =driver.findElement(By.xpath("//input[@formcontrolname='redirect_url']"));


redirect.sendKeys("<https://chargely.com/merchant/create/plan");
}

@Then("user can click the create plan button")
public void user_can_click_the_create_plan_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement save =driver.findElement(By.xpath("//button[text( )='Save']"));


save.click();
}
@Given("user can click the coupon")
public void user_can_click_the_coupon() throws InterruptedException {
	Thread.sleep(3000);
	WebElement coupon =driver.findElement(By.id("dashboard-id-10"));


coupon.click();
}

@Given("user can click the create coupon")
public void user_can_click_the_create_coupon() throws InterruptedException {
	Thread.sleep(3000);
	WebElement createcoupon =driver.findElement(By.xpath("//a[text( )='Create coupon']"));


createcoupon.click();
}

// USER NEED TO THE COUPON NAME
@Given("user can enter the coupon name")
public void user_can_enter_the_coupon_name() throws InterruptedException {
	Thread.sleep(3000);
	WebElement couponname =driver.findElement(By.xpath("//input[@formcontrolname='name']"));


couponname.sendKeys("AkRSHNAS");
}

// USER NEED TO CHANGE THE COUPON CODE
@Given("user can enter the coupon code")
public void user_can_enter_the_coupon_code() throws InterruptedException {
	Thread.sleep(3000);
	WebElement couponcode =driver.findElement(By.xpath("//input[@formcontrolname='code']"));


couponcode.sendKeys("3400");
}

@Given("user can enter the discount")
public void user_can_enter_the_discount() throws InterruptedException {
	Thread.sleep(3000);
	WebElement discount =driver.findElement(By.xpath("//input[@formcontrolname='discount_amount']"));


discount.sendKeys("40");
}

@Given("user can click the discounttype")
public void user_can_click_the_discounttype() throws InterruptedException {
	Thread.sleep(3000);
	WebElement discounttype =driver.findElement(By.xpath("//option[@value='flat']"));


discounttype.click();
}

@Given("user can click the Associatedplan")
public void user_can_click_the_associatedplan() throws InterruptedException {
	Thread.sleep(3000);
	WebElement Associatedplan =driver.findElement(By.xpath("//option[@value='dV9CWgCR']"));


Associatedplan.click();
}

@Given("user can click the startdate")
public void user_can_click_the_startdate() throws InterruptedException {
	Thread.sleep(3000);
	WebElement sdate =driver.findElement(By.xpath("//input[@formcontrolname='start_date']"));


sdate.sendKeys("12-03-2023");
}

@Given("user can click the enddate")
public void user_can_click_the_enddate() throws InterruptedException {
	Thread.sleep(3000);
	WebElement eate =driver.findElement(By.xpath("//input[@formcontrolname='end_date']"));


eate.sendKeys("31-03-2023");
}

// USER NEED TO CHANGE THE REDEMPTION LIMITS
@Given("user can enter RedemptionLimits")
public void user_can_enter_redemption_limits() throws InterruptedException {
	Thread.sleep(3000);
	WebElement RedemptionLimits =driver.findElement(By.xpath("//input[@formcontrolname='redemption_limit']"));


RedemptionLimits.sendKeys("560");
}

@Then("user can click the savecoupon")
public void user_can_click_the_savecoupon() throws InterruptedException {
	Thread.sleep(3000);
	WebElement savecoupon =driver.findElement(By.xpath("//button[text( )='Save']"));


savecoupon.click();
}

@Given("user can click invoices")
public void user_can_click_invoices() throws InterruptedException {
	Thread.sleep(3000);
	WebElement invoices =driver.findElement(By.id("dashboard-id-11"));


invoices.click();
}

@Given("user can click the create invoices")
public void user_can_click_the_create_invoices() throws InterruptedException {
	Thread.sleep(3000);
	WebElement createinvoices =driver.findElement(By.xpath("//a[text( )='Create Invoice']"));


createinvoices.click();
}

/// USERR NEED TO CHANGE THE BILL TO
@Given("user can enter the billto")
public void user_can_enter_the_billto() throws InterruptedException {
	Thread.sleep(3000);
	WebElement billto =driver.findElement(By.xpath("//input[@formcontrolname='email_to']"));


billto.sendKeys("arun@gmail.com");
}

@Given("user can select a planitem")
public void user_can_select_a_planitem() throws InterruptedException {
	Thread.sleep(3000);
	WebElement planitem =driver.findElement(By.xpath("//option[@value='63e9ee4c3fcf6f11fafb3bd8']"));


planitem.click();
}

@Given("user can enter the taxamount")
public void user_can_enter_the_taxamount() throws InterruptedException {
	Thread.sleep(3000);
	WebElement taxamount =driver.findElement(By.xpath("//input[@formcontrolname='tax_amount']"));


taxamount.sendKeys("400");
}

@Given("user enter the discount  value")
public void user_enter_the_discount_value() throws InterruptedException {
	Thread.sleep(3000);
	WebElement discount =driver.findElement(By.xpath("//input[@formcontrolname='discount_amount']"));


discount.sendKeys("10");
}

@Given("user can select the discount value")
public void user_can_select_the_discount_value() throws InterruptedException {
	Thread.sleep(3000);
	WebElement discountvalue =driver.findElement(By.xpath("//option[@value='flat']"));


discountvalue.click();
}
// USER NEEED TO CHANGE THE SUBJECT
@Given("user can enter the subject")
public void user_can_enter_the_subject() throws InterruptedException {
	Thread.sleep(3000);
	WebElement subject =driver.findElement(By.xpath("//input[@formcontrolname='subject']"));


subject.sendKeys("Holl");
}

@Given("user can enter the attachments")
public void user_can_enter_the_attachments() throws InterruptedException {
	Thread.sleep(3000);
	WebElement attachments =driver.findElement(By.xpath("//input[@type='file']"));


attachments.sendKeys("C:\\\\Users\\\\ADMIN\\\\Pictures\\\\Saved Pictures\\\\daily works\\\\sme.jpg");
}

 // USER NEED TO CHANGE THE MEMO TO MERCHANT
@Given("user can enter the memo to merchant")
public void user_can_enter_the_memo_to_merchant() throws InterruptedException {


Thread.sleep(3000);
WebElement merchant =driver.findElement(By.xpath("//textarea[@name='memo']"));
merchant.sendKeys("GWORK");
}

@Given("user can enter the logo")
public void user_can_enter_the_logo() throws InterruptedException {
	Thread.sleep(3000);
	WebElement Addlogo =driver.findElement(By.id("input-id-90357"));


Addlogo.sendKeys("C:\\\\Users\\\\ADMIN\\\\Pictures\\\\Saved Pictures\\\\daily works\\\\sme.jpg");
}

@Given("user can enter invoice date")
public void user_can_enter_invoice_date() throws InterruptedException {
	Thread.sleep(3000);
	WebElement invoicedate =driver.findElement(By.xpath("//input[@formcontrolname='invoice_date']"));


invoicedate.sendKeys("19-03-2023");
}

@Given("user can enter Due date")
public void user_can_enter_due_date() throws InterruptedException {
	Thread.sleep(3000);
	WebElement Duedate =driver.findElement(By.xpath("//input[@formcontrolname='invoice_due']"));


Duedate.sendKeys("20-03-2023");
}

@Then("user can click ivoicessave")
public void user_can_click_ivoicessave() throws InterruptedException {
	Thread.sleep(3000);
	WebElement ivoicessave =driver.findElement(By.xpath("//button[text( )='Save']"));


ivoicessave.click();
}

@Given("user can click the payment gateway")
public void user_can_click_the_payment_gateway() throws InterruptedException {
	Thread.sleep(3000);
	WebElement gateway2 = driver.findElement(By.id("dashboard-id-12"));


   gateway2.click();
}

@Given("user can click the paypal activate button")
public void user_can_click_the_paypal_activate_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement paypal = driver.findElement(By.id("ps-123"));


   paypal.click();
}

@Given("user can enter the user")
public void user_can_enter_the_user() throws InterruptedException {
	Thread.sleep(3000);
	WebElement user = driver.findElement(By.xpath("//input[@formcontrolname='user']"));


   user.sendKeys("pizzastore1_api1.email.com");
}
@Given("user can enter the password1")
public void user_can_enter_the_password1() throws InterruptedException {
	Thread.sleep(3000);
	WebElement password1 = driver.findElement(By.xpath("//input[@formcontrolname='password']"));


   password1.sendKeys("4U2YQEER4FP4FEXP");
}

@Given("user can enter the signature")
public void user_can_enter_the_signature() throws InterruptedException {
	Thread.sleep(3000);
	WebElement signature = driver.findElement(By.xpath("//input[@formcontrolname='signature']"));


   signature.sendKeys("A5d0ubZlCDcy3jINLppetQfBWN3UA7XXI0bLQmJwnL8WxO-2cXOPu0oi");
}

@Given("user can click the saveandcontinue1")
public void user_can_click_the_saveandcontinue1() throws InterruptedException {


Thread.sleep(3000);
WebElement saveandcontinue1 = driver.findElement(By.xpath("//button[text( )='Save and continue']"));
   
   saveandcontinue1.click();
}

@Given("user can click the stripe activate button")
public void user_can_click_the_stripe_activate_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement stripe = driver.findElement(By.id("ps-33e44"));


   stripe.click();
}

@Given("user can enter the public key")
public void user_can_enter_the_public_key() throws InterruptedException {
	Thread.sleep(3000);
	WebElement publickey = driver.findElement(By.xpath("//input[@formcontrolname='public_key']"));


   publickey.sendKeys("pk_test_51JNEBHSGb5eM5IZd30MgpXjzzA94SkY2aooHQ1FRhyZJgwW7TkqpmwUvp0l7wmm05DY5HuQz3tyuuPoqMefjnmKo00qKEKoi67");
}

@Given("user can enter the secert key")
public void user_can_enter_the_secert_key() throws InterruptedException {
	Thread.sleep(3000);
	WebElement secertkey = driver.findElement(By.xpath("//input[@formcontrolname='secret_key']"));
	   secertkey.sendKeys("sk_test_51JNEBHSGb5eM5IZdgw5V3RUuEoUjr6ZfnEju9vhHWqHMAFeWQ0SL64nvneevM7LiJqtmWpkCpyK1Xb1uymdBjObs00GeMBVYRn");
}
@Given("user can click the saveandcontinue2")
public void user_can_click_the_saveandcontinue2() throws InterruptedException {
	Thread.sleep(3000);
	WebElement saveandcontinue2 = driver.findElement(By.xpath("//button[text( )='Save and continue']"));


   saveandcontinue2.click();
}

@Given("user can click the braintree activate button")
public void user_can_click_the_braintree_activate_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement braintree = driver.findElement(By.id("ps-654612dwe"));


   braintree.click();
}

@Given("user can enter the merchant id")
public void user_can_enter_the_merchant_id() throws InterruptedException {
	Thread.sleep(3000);
	WebElement merchantid = driver.findElement(By.xpath("//input[@formcontrolname='merchantId']"));


   merchantid.sendKeys("42bxvffgmp6y5hsj");
}

@Given("user can enter the publickey")
public void user_can_enter_the_publickey() throws InterruptedException {
	WebElement publickey2 = driver.findElement(By.xpath("//input[@formcontrolname='publicKey']"));
	   Thread.sleep(3000);
	   publickey2.sendKeys("d2f2kmzvffrgpgtm");
}

@Given("user can enter the privatekey")
public void user_can_enter_the_privatekey() throws InterruptedException {
	WebElement privatekey2 = driver.findElement(By.xpath("//input[@formcontrolname='privatekey']"));
	   Thread.sleep(3000);
	   privatekey2.sendKeys("2ea177a003e494685a4fd53c4cb74b31");
}

@Given("user can click the saveandcontinue3")
public void user_can_click_the_saveandcontinue3() throws InterruptedException {
	Thread.sleep(3000);
	WebElement saveandcontinue3 = driver.findElement(By.xpath("//button[text( )='Save and continue']"));


   saveandcontinue3.click();
}

@Given("user can click the adyen activate button")
public void user_can_click_the_adyen_activate_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement adyen = driver.findElement(By.id("ps-cfasdaser34"));


   adyen.click();
}

@Given("user can enter themerchant account")
public void user_can_enter_themerchant_account() throws InterruptedException {
	Thread.sleep(3000);
	WebElement themerchant = driver.findElement(By.xpath("//input[@formcontrolname='merchantAccount']"));


   themerchant.sendKeys("Jaisriram_Chargely_TEST");
}

@Given("user can enter the api key")
public void user_can_enter_the_api_key() throws InterruptedException {
	Thread.sleep(3000);
	WebElement apikey = driver.findElement(By.xpath("//input[@formcontrolname='apikey']"));


   apikey.sendKeys("AQErhmfxJovOaBBDw0m/n3Q5qf3VYopEHoFDSmRb8WV1n2Turc/dAur2eDP9nRDBXVsNvu…");
}

@Given("user can enter the client key")
public void user_can_enter_the_client_key() throws InterruptedException {
	Thread.sleep(3000);
	WebElement clientkey = driver.findElement(By.xpath("//input[@formcontrolname='clientKey']"));


   clientkey.sendKeys("test_UJAVR444JFH4VACMW2N53DSDLY46X5WB");
}

@Given("user can click  the saveandcontinue4")
public void user_can_click_the_saveandcontinue4() throws InterruptedException {
	Thread.sleep(3000);
	WebElement saveandcontinue4= driver.findElement(By.xpath("//button[text( )='Save and continue']"));


   saveandcontinue4.click();
}

@Given("user can click the payflowpro activate button")
public void user_can_click_the_payflowpro_activate_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement payflowpro = driver.findElement(By.id("ps-edqweqwe2434"));


   payflowpro.click();
}

@Given("user can enter the userid")
public void user_can_enter_the_userid() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  userid= driver.findElement(By.xpath("//input[@formcontrolname='user']"));


   userid.sendKeys("jaisriram1911");
}

@Given("user can enter the passwordid")
public void user_can_enter_the_passwordid() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  passwordid= driver.findElement(By.xpath("//input[@formcontrolname='password']"));


   passwordid.sendKeys("JAI@1918");
}

@Given("user can enter the vendor")
public void user_can_enter_the_vendor() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  vendor= driver.findElement(By.xpath("//input[@formcontrolname='vendor']"));


   vendor.sendKeys("jaisriram1911");
}

@Given("user can enter the partner")
public void user_can_enter_the_partner() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  partner= driver.findElement(By.xpath("//input[@formcontrolname='partner']"));


   partner.sendKeys("PayPal");
}

@Given("user can enter the saveandcontinue5")
public void user_can_enter_the_saveandcontinue5() throws InterruptedException {
	Thread.sleep(3000);
	WebElement saveandcontinue5= driver.findElement(By.xpath("//button[text( )='Save and continue']"));


   saveandcontinue5.click();
}

@Given("user can click the paymentspro activate button")
public void user_can_click_the_paymentspro_activate_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement paymentspro = driver.findElement(By.id("ps-caedf434"));


   paymentspro.click();   
}

@Given("user can enter the username")
public void user_can_enter_the_username() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  username= driver.findElement(By.xpath("//input[@formcontrolname='username']"));


   username.sendKeys("pizzastore1_api1.email.com");
}

@Given("user can enter the signature2")
public void user_can_enter_the_signature2() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  signature2= driver.findElement(By.xpath("//input[@formcontrolname='signature']"));


   signature2.sendKeys("A5d0ubZlCDcy3jINLppetQfBWN3UA7XXI0bLQmJwnL8WxO-2cXOPu0oi");
}

@Given("user can enter the password2")
public void user_can_enter_the_password2() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  password2= driver.findElement(By.xpath("//input[@formcontrolname='password']"));


   password2.sendKeys("4U2YQEER4FP4FEXP");
}

@Then("user can click the saveandcontinue6")
public void user_can_click_the_saveandcontinue6() throws InterruptedException {
	Thread.sleep(3000);
	WebElement saveandcontinue6= driver.findElement(By.xpath("//button[text( )='Save and continue']"));


   saveandcontinue6.click();
}
@Given("user can click  paymentpage")
public void user_can_click_paymentpage() throws InterruptedException {
	Thread.sleep(3000);
	WebElement paymentpage= driver.findElement(By.id("dashboard-id-13"));


paymentpage.click();
}

@Given("user can click the biilingpage apc")
public void user_can_click_the_biilingpage_apc() throws InterruptedException {
	Thread.sleep(3000);
	WebElement apc= driver.findElement(By.id("promo_code"));


apc.click(); 
}

@Given("user can click the billingpage ccbd")
public void user_can_click_the_billingpage_ccbd() throws InterruptedException {
	Thread.sleep(3000);
	WebElement ccbd= driver.findElement(By.id("customer_details"));


ccbd.click(); 
}

@Given("user can click the el")
public void user_can_click_the_el() throws InterruptedException {
	Thread.sleep(3000);
	WebElement el= driver.findElement(By.id("login_details"));


el.click(); 
}

@Given("user can upload the unewlogo")
public void user_can_upload_the_unewlogo() throws InterruptedException {
	Thread.sleep(3000);
	WebElement unewlogo= driver.findElement(By.xpath("//img[@alt='app logo']"));


unewlogo.sendKeys("C:\\\\Users\\\\ADMIN\\\\Pictures\\\\Saved Pictures\\\\daily works"); 
}

@Given("user can enter the url supported website")
public void user_can_enter_the_url_supported_website() throws InterruptedException {
	Thread.sleep(3000);
	WebElement supportedwebsite= driver.findElement(By.xpath("//input[@name='support_website']"));


supportedwebsite.sendKeys("<https://chargely.com/merchant/dashboard/coupons"); 
}

@Given("user can enter the supportemail")
public void user_can_enter_the_supportemail() throws InterruptedException {
	Thread.sleep(3000);
	WebElement usupportemail= driver.findElement(By.xpath("//input[@name='support_email']"));


usupportemail.sendKeys("arunclaps@gmail.com"); 
}

@Given("user can click the savebutton")
public void user_can_click_the_savebutton() throws InterruptedException {
	Thread.sleep(3000);
	WebElement savebutton1= driver.findElement(By.xpath("//button[text( )='Save']"));


savebutton1.click(); 
}

@Given("user can click the preview button")
public void user_can_click_the_preview_button() throws InterruptedException {
	Thread.sleep(3000);
	WebElement preview= driver.findElement(By.xpath("//a[text( )='Preview']"));


preview.click(); 
}

@Given("user enter the coupon code")
public void user_enter_the_coupon_code() throws InterruptedException {
	Thread.sleep(3000);
	WebElement usercoupon= driver.findElement(By.xpath("//input[@class='coupon-input']"));


usercoupon.sendKeys("000"); 
}
@Given("user can clcik the apply  coupon code")
public void user_can_clcik_the_apply_coupon_code() throws InterruptedException {
	Thread.sleep(3000);
	WebElement applycoupon= driver.findElement(By.xpath("//button[text( )=' Apply Coupon ']"));


applycoupon.click(); 
}

@Given("user can enter the card number")
public void user_can_enter_the_card_number() throws InterruptedException {
	Thread.sleep(3000);
	WebElement  cardnumber= driver.findElement(By.xpath("//input[@formcontrolname='cc_num']"));


 cardnumber.sendKeys("4242424242424242"); 
}

@Given("user can expriation date")
public void user_can_expriation_date() throws InterruptedException {
	Thread.sleep(3000);
	WebElement expriationdate= driver.findElement(By.xpath("//input[@placeholder='mm / yyyy']"));


expriationdate.sendKeys("09/2023"); 
}

@Given("user can enter the cvv")
public void user_can_enter_the_cvv() throws InterruptedException {
	Thread.sleep(3000);
	WebElement cvv= driver.findElement(By.xpath("//input[@formcontrolname='cvv']"));


cvv.sendKeys("254"); 
}

@Given("user can click the  completeorder")
public void user_can_click_the_completeorder() throws InterruptedException {
	Thread.sleep(3000);
	WebElement completeorder= driver.findElement(By.xpath("//button[text( )='Complete Order']"));


completeorder.click(); 
}

@Given("user can click the backbutton")
public void user_can_click_the_backbutton() throws InterruptedException {
	Thread.sleep(3000);
	WebElement backbutton= driver.findElement(By.id("back_button"));


backbutton.click(); 
}

}

