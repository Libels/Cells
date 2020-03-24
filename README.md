# Cells

This Project using TSV to Store data since we using paragraph that might had comma, this the simple csv parser

```js
fs = require('fs')
os = require('os');

fs.readFile('data.raw', 'utf8', function (err, data) {
	
	if (err) {
		return console.log(err);
	}
	
	var lines = data.split(",");
	var emp = [];
	
	for (let i = 0; i < lines.length; i++) {
		emp[i] = lines[i].split("|").join('	');
	}
	
	
	
	fs.writeFile("file.tsv", emp.join('\n'), function(err) {
		if(err) {
			return console.log(err);
		}
		
		console.log("Data Generated!");
	}); 
});
```
