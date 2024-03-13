# Selenium-Automation

1. **WebDriver Setup**: 
   - Import necessary Selenium and WebDriver classes.
   - Create a `FirefoxDriver` instance to control the Firefox browser.

2. **Opening URL**: 
   - Use the `get` method to open the specified URL (`https://automationexercise.com`).

3. **Verifying Home Page Visibility (3rd METHOD)**: 
   - Find the home page element using XPath (`//i[@class=\"fa fa-home\"]`).
   - Check if the element is displayed using `isDisplayed` method.
   - Print appropriate message based on visibility status.

4. **Navigating to Signup/Login Page**:
   - Find and click on the "Signup / Login" link using XPath (`//a[normalize-space()='Signup / Login']`).

5. **Verifying New User Signup Page Visibility**:
   - Find the new signup page element using XPath (`//*[@id=\"form\"]/div/div/div[3]/div/h2`).
   - Check if the element is displayed.
   - Print appropriate message based on visibility status.

6. **Filling Signup Form**:
   - Find and fill the name, email, password, gender, birth date, newsletter, opt-in, first name, last name, company, address, country, state, city, zipcode, and phone number fields.
   - Select dropdown values for day, month, and year.

7. **Creating Account**:
   - Click on the "Signup" button using XPath (`//button[normalize-space()='Signup']`).

8. **Verifying Account Creation**:
   - Find the account created message element using XPath (`/html/body/section/div/div/div/h2/b`).
   - Check if the element is displayed.
   - Print appropriate message based on visibility status.

9. **Navigating Back to Home Page**:
   - Refresh the page and click on the home page link using XPath (`/html/body/section/div/div/div/div/a`).

10. **Verifying Logged Username Visibility**:
    - Find the logged username element using XPath (`/html/body/header/div/div/div/div[2]/div/ul/li[10]/a`).
    - Check if the element is displayed.
    - Print appropriate message based on visibility status.

11. **Deleting Account**:
    - Refresh the page and click on the account delete link using XPath (`//a[@data-qa=\"continue-button\"]`).

12. **Verifying Account Deletion**:
    - Find the account deleted message element using XPath (`//h2[@data-qa=\"account-deleted\"]`).
    - Check if the element is displayed.
    - Print appropriate message based on visibility status.

13. **Closing Browser**:
    - Close the browser using `close` method.

You can add this detailed explanation to your GitHub readme file to help others understand your Selenium automation script.
