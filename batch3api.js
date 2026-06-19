fetch("https://jsonplaceholder.typicode.com/posts/5",
    {
        method: "PATCH",
        headers: {
            'Content-Type' : 'application/json'
        },
        body: JSON.stringify({
            title: 'Lokee Post',
        })
    }
)
.then(response => response.json())
.then(data => {console.log(data)})