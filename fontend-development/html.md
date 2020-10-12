# HTML

0\) what happens when you enter a URL 

* browser contacts DNS server to look up IP address of domain name
* connection is established with that IP address to request for the file 
* web server respond back with HTTP headers and copy of requested file 



1\) MetaData 

* defined in the header section used to specify information with its tag attribute 
* below shows that page will refresh and be redirected to another web 

```markup

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="refresh" content="5; url='http://www.google.com.sg'">
    <title>Document Title</title>
    <style>
      p { font-family: Courier; font-size: 77px; }
    </style>
    <script>
      alert('Hello world'); // pop up an alert
    </script>
  </head>
  <body>
    <p>Page Content Goes here!</p>
  </body>
</html>
```

2\) number of ways of doing css styling

* in the header section add &lt;style&gt; setting like above
* in the attribute , directly apply style e.g. &lt;h1 style="color:red"&gt;
* in a separate file defined css attribute , then in the html use link and ref 

```markup
<link rel="stylesheet" href="style.css">

```

3\) HTML links 

```markup

<a href="https://www.w3schools.com">This is a link</a>
```

4\) HTML Images

alt is for when the page is not there, display a text 

```markup
<img src="w3schools.jpg" alt="W3Schools.com" width="104" height="142">
```

5\) HTML line break

&lt;br&gt; 



