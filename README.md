# Selenium-Java-GaugeDemo

This repository contains a Selenium project using Java and Gauge for automated testing. The project demonstrates setting up a test framework, writing test cases, and executing them with Gauge.

## Libraries and Tools Used

- Selenium WebDriver
- Gauge
- Java
- Maven

## Requirements

- JDK 11 or higher
- Maven 3.6.0 or higher
- ChromeDriver (compatible with your version of Chrome)
- Gauge

## Setup

1. **Clone the repository.**

    ```shell
    git clone https://github.com/DrPavel81/Selenium-Java-GaugeDemo.git
    cd Selenium-Java-GaugeDemo
    ```

2. **Install the required Maven packages.**

    ```shell
    mvn clean install
    ```

3. **Download and set up ChromeDriver.**

    - Ensure you have [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads) installed.
    - Update the `chromedriver` path in your configuration files if necessary.

4. **Install Gauge.**

    Follow the instructions on the [Gauge installation page](https://docs.gauge.org/getting_started/installing-gauge.html) to install Gauge.

5. **Install Gauge Java plugin.**

    ```shell
    gauge install java
    ```

## Running the Tests

To execute the tests, run:

```shell
mvn test
