# SpringBootSecurity
Spring Application with authorization. 
I based my choice on OAuth 2 authorization.
I focused on the authorization code grant flow to obtain a JSON Web Token (JWT) access token. This must involve creating a handful of applications that work together, including the following:
The authorization server—An authorization server’s job is to obtain permission
from a user on behalf of a client application. If the user grants permission, then
the authorization server gives an access token to the client application that it
can use to gain authenticated access to an API.
The resource server—A resource server is just another name for an API that is
secured by OAuth 2. Although the resource server is part of the API itself, for
the sake of discussion, the two are often treated as two distinct concepts. The
resource server restricts access to its resources unless the request provides a
valid access token with the necessary permission scope.
The client application —The client application is an application that wants to con-
sume an API but needs permission to do so.

In this application I realized only authorization server
