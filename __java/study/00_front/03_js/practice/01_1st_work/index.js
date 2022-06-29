let sbmBtn = document.getElementById("sbmBtn");
let printBtn = document.getElementById("printBtn");
console.log(printBtn);

const dataObj = {};

function getDatas() {
  let uname = document.getElementById("uname").value;
  let addr = document.getElementById("addr").value;
  let favor1 = document.getElementById("favor1").value;
  let favor2 = document.getElementById("favor2").value;
  let favor3 = document.getElementById("favor3").value;
  let email = document.getElementById("email").value;
  let pet = document.getElementById("pet").value;
  let wanna = document.getElementById("wanna").value;

  dataObj.uname = uname;
  dataObj.addr = addr;
  dataObj.favors = {};
  dataObj.favors.favor1 = favor1;
  dataObj.favors.favor2 = favor2;
  dataObj.favors.favor3 = favor3;
  dataObj.email = email;
  dataObj.pet = pet;
  dataObj.wanna = wanna;
  console.log(dataObj);
}
function printDatas() {
  document.getElementById("unameVal").innerText = dataObj.uname;
  document.getElementById("addrVal").innerText = dataObj.addr;
  document.getElementById("emailVal").innerText = dataObj.email;
  document.getElementById("petVal").innerText = dataObj.pet;
  document.getElementById("wannaVal").innerText = dataObj.wanna;
  let str = `<li>${dataObj.favors.favor1}</li>`;
  str += `<li>${dataObj.favors.favor2}</li>`;
  str += `<li>${dataObj.favors.favor3}</li>`;
  document.getElementById("favors").innerHTML = str;
}
