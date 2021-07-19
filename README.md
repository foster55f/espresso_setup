# Espresso Setup 

#### What is in this repo?

- Adds test files within `E2E` for `sourcey/materiallogindemo` app

`Login.kts`

`LoginView.kts`

`ReusableFunctions.kts`

#### What are the main files impacted by this story?
`app/src/androidTest/E2E/Login/Login.kts`

`app/src/androidTest/E2E/Login/LoginView/LoginView.kts`

`app/src/androidTest/ReusableFunctions/ReusableFunctions.kts`

#### How should this be tested? 
This setup was created to provide an overview on how I would test this app using Espresso.

#### Background context
With this repo, I attempted to provide a sample for how I would test the app. In this repo, the LoginActivity view was the focus of my testing. I created an 
Espresso test file, view file, and reusable functions file. Within the `LoginView.kts` file, elements and functions were laid out for testing. In the `Login.kts` test 
file, I created a test to assert for certain views, error states, and incorporated the ATF(Accessibility Testing Framework) to assert for certain accessibility 
requirements. The `ReusableFunctions.kts` file was used for common functions needed for testing. 

#### Obligatory GIF

![protect](https://media.giphy.com/media/8YvAZPTtxccpk2PME6/giphy.gif)
