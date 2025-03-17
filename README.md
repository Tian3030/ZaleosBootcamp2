# Zaleos Bootcamp2
## Zapi Social Network
### Resources tutorial
All the API management page is inside the /api resource, that contains all the contents of our interest to create a useful social network.

#### Users Management (/users)
This resource manages all the functionalities about users. These are the following:

- User Creation
- User Listing 
- User Finding
- User Deletion
- User Update

**User Creation** 
This feature is managed in /users resource. This is done by sending a POST requests including as JSON data the following example's attributes:
```json
User: {
    "username": "jamie77",
    "name": "James", 
    "header": "Scottish living in spain. I like rugby and football"
}
```
Curl example:
```bash
curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{ "username": "jamie77","name": "James", "header": "Scottish living in spain. I like rugby and football"}'
```

**User Listing** 
A list with current users can be obtained in JSON format sending a GET request to this URL.
Curl example:
```bash
curl http://localhost:8080/api/users
```

**User Finding** (/{username})
To ask for an specific user, there's also the  resource /{username}.
Curl example:
```bash
curl http://localhost:8080/api/users/jamie77
```

**User Update** (/{username})
We can update a user sending a PATCH or PUT request, this will allow us to modify some attribute (except the id) without sending a full User JSON request.

Curl example (PATCH)
```bash
curl -X PATCH http://localhost:8080/api/users/jamie77 -H 'Content-Type: application/json' -d '{"followed": 20000}'
```
Curl example (PUT)
```bash
curl -X PUT http://localhost:8080/api/users/jamie77 -H 'Content-Type: application/json' -d '{ "username": "jamie77","name": "James", "header": "Scottish living in spain. I like rugby and football","followers":20000,"followed":20}'
```

**User Deletion**   (/{username})
To delete a specific user, we use access the user's resource and send a DELETE request.

```bash
curl -X DELETE http://localhost:8080/api/users/jamie77
```

#### Posts Management (/posts)
This resource manages all the functionalities about posts. These are the following:

- Post Creation
- Post Listing 
- Post Finding
- Post Deletion
- Like/Dislike/Share/Unshare Post

**Post Creation** 
This feature is managed in /posts resource. This is done by sending a POST requests including as JSON data the following example's attributes:
```json
Post: {
    "username": "jamie77",
    "likes": 0, 
    "shares": 0, 
    "description": "Enjoying a great rugby match with friends"
}
```
_likes,shares and description are all optional_

Curl example:
```bash
curl -X POST http://localhost:8080/api/posts -H "Content-Type: application/json" -d '{ "username": "jamie77","likes": 0, "shares":0, "description": "Enjoying a great rugby match with friends"}'
```

**Post Listing** 
A list with posts can be obtained in JSON format sending a GET request.
Curl example:
```bash
curl http://localhost:8080/api/posts
```
You can also filter the posts by author with the `username` parameter in the URI.
Curl example:
```bash
curl http://localhost:8080/api/posts?username=jamie77
```

**Post Finding** (/{idPost})
There's also an option to ask for a specific post.
Curl example:
```bash
curl http://localhost:8080/api/posts/1
```
**Like/Dislike/Share/Unshare Post** (/{idPost})
These features are done very similarly sending a GET request to one or another URL.

Curl examples:
- /like
```bash
curl http://localhost:8080/api/posts/1/like
```
- /dislike
```bash
curl http://localhost:8080/api/posts/1/dislike
```
- /share
```bash
curl http://localhost:8080/api/posts/1/share
```
- /unshare
```bash
curl http://localhost:8080/api/posts/1/unshare
```

**Post Deletion**   (/{idPost})
To delete a specific post, we can access the post's resource and send a DELETE request.

Curl example:
```bash
curl -X DELETE http://localhost:8080/api/posts/1
```

#### Comments Management (/comments)
This resource manages all the functionalities about comments. These are the following:

- Comment Creation
- Comment Listing 
- Comment Finding
- Comment Deletion

**Comment Creation** 
Done by sending POST requests including as JSON data the following example's attributes:
```json
Comment: {
    "username": "jamie77",
    "comment": "Enjoying a great rugby match with friends",
    "idPost":0
}
```
Curl example:
```bash
curl -X POST http://localhost:8080/api/comments -H "Content-Type: application/json" -d '{"username": "jamie77","comment": "Enjoying a great rugby match with friends","idPost":0}'
```

**Comment Listing** 
A list with comments can be obtained in JSON format sending a GET request. 
Curl example:
```bash
curl http://localhost:8080/api/comments
```

The request can additionally include an  `idPost` argument to filter the comments by post.
Curl example:
```bash
curl http://localhost:8080/api/comments?idPost=1
```

**Comment Finding** (/{comment_id})
To ask for an specific comment.
Curl example:
```bash
curl http://localhost:8080/api/comments/1
```

**Comment Deletion**   (/{comment_id})
To delete a specific comment, we can access the comment's resource and send a DELETE request.

Curl example:
```bash
curl -X DELETE http://localhost:8080/api/comments/1
```
