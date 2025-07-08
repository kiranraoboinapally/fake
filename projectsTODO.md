Project 1:

Task Description

Your task is to write a Python program to fetch research papers based on a user-specified query. The program must identify papers with at least one author affiliated with a pharmaceutical or biotech company and return the results as a CSV file.

Problem Details

1. Source of Papers

Fetch papers using the PubMed API

The program should support PubMed's full query syntax for flexibility.

2. Output Requirements

Return the results as a CSV file with the following columns:

PubmedID: Unique identifier for the paper.

Title: Title of the paper.

Publication Date: Date the paper was published.

Non-academic Author(s): Names of authors affiliated with non-academic institutions.

Company Affiliation(s): Names of pharmaceutical/biotech companies.

Corresponding Author Email: Email address of the corresponding author.

3. Command-line Program Features

Accept the query as a command-line argument.

Provide the following options:

-hor--help: Display usage instructions.

-dor--debug: Print debug information during execution.

-for-file: Specify the filename to save the results. If this option is not provided, print the output to the console.

4. Code Organization and Environment

Version Control:

Use Git for version control. The code must be hosted on GitHub.

Dependencies and Setup:

Use Poetry for dependency management and packaging.

Ensure that running poetry install sets up all dependencies.

Execution:

Provide an executable command named get-papers-list via Poetry.

5. Documentation

Include a README.md file with the following details:

How the code is organized.


---



Project 2:

Back End - Spot Exposure Hedging Bot

Objective
Develop a sophisticated risk management system that monitors and automatically hedges directional risk of spot positions using perpetual futures or options. The system will feature a Telegram bot with an interactive interface, allowing users to:

1. Set up automated hedging strategies for spot positions using perpetual futures or options across multiple exchanges, with real-time monitoring and adjustment capabilities.
2. Access comprehensive risk analytics including position sizing, delta calculations, and portfolio-level risk metrics, delivered through interactive Telegram notifications.
3. The entire system will be controlled and deliver notifications via the integrated Telegram bot, using features like input buttons and message editing for a seamless user experience.

Initial Setup
1. Set up a development environment for Python.
2. Integrate with multiple cryptocurrency exchange APIs to retrieve real-time public and open source orderbook data (OKX, Bybit, and Deribit).  Ensure the service is unpaid/free for demo purposes.
3. Create a new Telegram Bot using BotFather and obtain the API token.
4. Use Kaggle/Google CoLab free tier for any gpu processing needs

Core Requirements:
1. Position Risk Calculation:
• Implement real-time calculation of position delta, gamma, theta, and vega for options-based hedging strategies.
• For perpetual-based hedging, calculate the hedge ratio based on correlation and beta between spot and perpetual instruments.
• Continuously monitor portfolio-level risk metrics including Value at Risk (VaR), maximum drawdown, and correlation matrices.
• Implement configurable risk thresholds that trigger hedging actions (e.g., delta exposure > X%, portfolio VaR > Y%).

2. Telegram Alerting and Interaction:
• When risk thresholds are exceeded, send clearly formatted alerts to Telegram including: current position details, calculated risk metrics, recommended hedging actions, and estimated costs.
• Alerts should include: asset names, position sizes, current delta exposure, recommended hedge size, and potential hedging costs.
• The bot should allow users to Start/Stop/Configure the Risk Monitoring Service using commands like /monitor_risk <asset> <position_size> <risk_threshold>.
• Implement interactive buttons for quick actions like "Hedge Now", "Adjust Threshold", or "View Analytics".

3. Hedging Strategy Implementation:
• Implement multiple hedging strategies:
◦ Delta-neutral hedging using perpetual futures
◦ Options-based hedging (protective puts, covered calls, collars)
◦ Dynamic hedging with rebalancing based on market movements
• Support both manual and automated execution modes with user confirmation for large trades.

4. Execution Logic:
• Calculate optimal hedge sizes based on current market conditions and position characteristics.
• Implement smart order routing to minimize execution costs across multiple venues.
• Include slippage estimation and transaction cost analysis in hedging decisions.
• Support partial hedging and gradual position adjustment to minimize market impact.
•
5. Interactive Reporting via Telegram:
• Provide real-time updates on hedging execution status and performance.
• Send notifications for: hedge execution confirmations, cost analysis, and performance tracking.
• Implement bot commands to:
•     Start/Stop/Configure automated hedging (e.g., /auto_hedge <strategy> <threshold>)
•     Query current hedging status and performance (e.g., /hedge_status <asset>)
•     View historical hedging performance and costs (e.g., /hedge_history <asset> <timeframe>)
•     Manually trigger hedging actions (e.g., /hedge_now <asset> <size>)

6. Portfolio Analytics:
• Calculate and maintain comprehensive risk metrics including:
•     Portfolio-level delta, gamma, theta, vega exposures
•     Correlation analysis between positions and hedging instruments
•     Stress testing scenarios for various market conditions
•     Real-time P&L attribution analysis

7. Interactive Analytics via Telegram:
• Provide on-demand risk reports through bot commands.
• Implement interactive charts and visualizations for risk metrics.
• Send periodic risk summaries and performance updates.
• Allow users to configure custom risk alerts and thresholds.

Technical Requirements
1. Implementation in Python with robust error handling and logging.
2. Efficient real-time data processing and risk calculation engines.
3. Clean, maintainable, and well-documented code architecture with clear separation of concerns.
4. Comprehensive unit tests for risk calculation logic and hedging strategies.
6. Secure handling of position and trading data with proper authentication.

Bonus Section (Recommended)
1. Machine Learning Integration: Implement ML-based volatility forecasting and optimal hedge timing.
2. Multi-Asset Portfolio Hedging: Extend the system to handle complex multi-asset portfolios with cross-asset correlations.
3. Advanced Options Strategies: Implement sophisticated options strategies like iron condors, butterflies, and straddles.
4. Backtesting Framework: Create a comprehensive backtesting system to validate hedging strategies.
5. Regulatory Compliance: Implement position reporting and risk disclosure features for regulatory requirements.
6. Performance Attribution: Detailed analysis of hedging effectiveness and cost-benefit analysis.

Documentation Requirements
1. Detailed explanation of:
• System architecture and risk management framework.
• Hedging strategy implementation and mathematical foundations.
• Real-time risk calculation algorithms and methodologies.
• Telegram bot command structure and interaction flow.
2. Setup and deployment instructions with configuration examples.
3. Risk management best practices and limitations of the implemented strategies.

Deliverables
1. Complete source code with comprehensive documentation and inline comments.
2. A video recording demonstrating:
• System setup and configuration via the Telegram bot.
• Real-time position monitoring and risk calculation.
• Automated hedging execution and performance tracking.
• Interactive risk analytics and reporting features.
• A walkthrough of the code, explaining key components, risk models, and hedging logic.
3. If completing the bonus section:
• Demonstration and documentation of bonus features.
4. Risk management documentation including:
• Mathematical models and formulas used.
• Assumptions and limitations of the hedging strategies.
• Performance analysis and optimization recommendations


---

Project 3:
