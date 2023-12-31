const URL = "https://cat-fact.herokuapp.com/facts";
const factPara = document.querySelector('#fact');

const btn = document.querySelector("#btn");

// 1st Way 
const getFacts = async () => {
    console.log("getting data .....");
    let response = await fetch(URL);
    console.log(response.status);  // JSON Format
    let data = await response.json();
    factPara.innerText = data[2].text
};

// 2nd Way
function getFacts() {
    fetch(URL).then((response) => {
        return response.json();
    }).then((data)=>{
        console.log(data);
        factPara.innerText = data[2].text;
    })
}

btn.addEventListener("click", getFacts);