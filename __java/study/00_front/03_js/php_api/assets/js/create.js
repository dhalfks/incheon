async function registerItemToServer(itemObj) {
  try {
    const url ='http://smartjava.dothome.co.kr/api/items/create';
    const config = {
      method: 'POST',
      headers: {
        'Accept':'application/json',
        'Content-Type':'application/x-www-form-urlencoded'
      },
      body: JSON.stringify(itemObj)
    };
    const resp = await fetch(url, config);
    const result = await resp.json();
    return await result;
  } catch (error) {
    console.log(error);
  }
}

document.querySelector('button.w-100.btn').addEventListener('click', (e) => {
  e.preventDefault();
  const inputs = document.querySelectorAll('.needs-validation input');

  let itemObj = {};

  inputs.forEach(elem => {
    itemObj[elem.id] = elem.value;
  });

  // let cateSelect = document.getElementById('category');  
  // let selectedValue = cateSelect.options[cateSelect.options.selectedIndex].value;
  // itemObj.category = selectedValue;

  itemObj.category_id = document.querySelector('#category option:checked').value;

  const now = new Date();
  let createNow = `${now.getFullYear()}-${now.getMonth()+1}-${now.getDate()} ${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`;
  itemObj.created = createNow;
  
  console.log(itemObj);

  registerItemToServer(itemObj).then(result => {
    console.log(result);
    alert(result.message);
    // location.replace('index.html');
  }
  );
});