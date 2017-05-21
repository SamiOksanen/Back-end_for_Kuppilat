# Back-end_for_Kuppilat
-------------------
Demonstrates really simple way the capabilities of the Spring MVC web framework and the RESTful web service.
After reviewing this project, you should have a good understanding of what the basics of Spring MVC and REST can do and get a feel for how easy it is to use.

Returns json data about bar reviews:

* **URL**

  http://localhost:8080/arvostelut/kaikki

* **Method:**

  `GET` | `POST` 

* **Success Response:**

  * **Code:** 200 <br />
    **Content (example):** `{ id : 17, paikka : "Some Bar", paiva : "20.05.2017", arvosana : "3", kuvaus : "Some description about the  bar" }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />

  OR

  * **Code:** 401 UNAUTHORIZED <br />

* **Sample Call:**

  ```javascript
    $.ajax({
      url: "http://localhost:8080/arvostelut/kaikki",
      type: "GET",
      dataType: "json",
      contentType: "application/json; charset=utf-8",
      success : function(r) {
        console.log(r);
      }
    });
  ```
