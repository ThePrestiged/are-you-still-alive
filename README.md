# are-you-still-alive
AYSA Project.

The purpose of this project is to create a subscription service that is usable through web browsers and mobile applications both on iOS and Android platforms.
It should also have access to automated text and email services.

The subscription service will basically be doing as the repository is named: checking if the user is still alive. When a person creates a user with their name,
age, date of birth, and a list of contacts, the service will check if the user is still alive by sending them a notification through text, email, and/or through
the mobile application or website. This notification will pop up once for 'x' amount of time that passes, which will be set by the user. If it is not set by the user,
then a standard one-month timer is set. 

If the user fails to complete the notification task, then the service will initially send a message to the contacts of the user's contact list, letting them know
that the user has not completed their task. If 3 notifications are not completed within their total alloted time, then the service concludes that the person is no
longer on this plane of existence, and suspends it's monthly membership services.
