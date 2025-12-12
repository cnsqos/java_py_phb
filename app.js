// import { apiFetch } from './api.js';

// //DOM 요소를 참조(등록)
// const itemTableBody = document.querySelector("#itemTableBody");
// const addItemForm = document.querySelector("#addItemForm");
// const messageElement = document.querySelector("#message");


// //초기화 함수 
// //화면에 dom요소들이 로딩이 완료됐다면, 콜백을 함수를 실행해라.
// document.addEventListener("DOMContentLoaded", () => {
//     //목록 조회
//     fetchProducts();
//     //상품 추가
//     addItemForm.addEventListener("submit", handleAddItem);

// })



// //상품 목록을 조회하는 fetchProducts함수
// async function fetchProducts(){
//     //tbody의 <td>에 상품 목록을 로딩중...
//     itemTableBody.innerHTML = '<tr><td colspan="6">상품 목록 로딩 중...</td></tr>';
//     try {
//         //apiFetch() 함수를 이용하여 서버에 요청하고 데이터를 반환받는다.
//         const products = await apiFetch('/product');
//         //잘 넘어왔는지 콘솔에 띄운다.
//         console.log(products);

//         //Cross-Origin 처리

//         renderTable(products);

//     } catch (error) {
//         //apiFetch에서 발생한 에러를 여기서 처리
//         //tbody에 "상품 목록을 불러올 수 없습니다."
//         itemTableBody.innerHTML = '<tr><td colspan="6">상품 목록을 불러 올 수 없습니다.</td></tr>';
//     }
// }

// //반환 받은 데이터를 테이블에 넣어줘야 함
// function renderTable(products){
//     itemTableBody.innerHTML = '';
//     if(products.length === 0){
//         itemTableBody.innerHTML = '<tr><td colspan="6">등록된 상품이 없습니다.</td></tr>';
//         return;

//     }
//     products.forEach((product) => {
//         addNewRowToTable(product);
//     });
// }

// function addNewRowToTable(item){
//     //상품 등록 시 최신 상품이 테이블의 가장 위에 오도록 작성하기
//     //<tbody>에 해당하는 itemTableBody 내부에 새로운 행(Row) 즉 <tr>요소를 생성하고 삽입하는 역할
//     const row = itemTableBody.insertRow(0);
//     //테이블 행 <tr>에 <td>를 생성하고, 텍스트를 넣는 작업
//     row.insertCell(0).textContent = item.id;
//     row.insertCell(1).textContent = item.name;
//     row.insertCell(2).textContent = item.stock;
//     row.insertCell(3).textContent = item.price;
//     row.insertCell(4).textContent = item.createdAt;
//     row.insertCell(5).textContent = item.updatedAt;
// }


// //상품 추가하기

// async function handleAddItem(event){
//     event.preventDefault(); //특정 이벤트에 의해 발생할 예정이었던 브라우저의 기본 동작을 중단시키는 역할

//     //input에 적힌 내용들을 가지고 서버로 전달하기 위한 newProduct 객체
//     const newProduct = {
//     name: document.querySelector("#productName").value,
//     stock: document.querySelector("#productStock").value,
//     price: document.querySelector("#productPrice").value
// }

//     //message에 "등록중..."; 이라고 띄우기
//     messageElement.textContent = '등록중...';

//     //message의 글씨 색을 #007bff로 바꾸기
//     messageElement.style.color = '#007bff';


//     //try-catch에서 method, headers, body 옵션을 명시하여 apiFetch() 메서드를 호출

//     try {
//     await apiFetch('/product', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json',
//         },
//         body: JSON.stringify(newProduct)
//     });

//     await fetchProducts();
//     addItemForm.reset();

//     messageElement.textContent = `상품 "${newProduct.name}" 이(가) 성공적으로 등록되었습니다.`;
//     messageElement.style.color = '#28a745';

//     } catch (error) {
//     messageElement.textContent = `오류 : ${error.message}`;
//     messageElement.style.color = 'red';
//     }
//     //console.log에 데이터 띄우기

    
// }

import { apiFetch } from './api.js';

const itemTableBody = document.querySelector("#itemTableBody");
const addItemForm = document.querySelector("#addItemForm");
const messageElement = document.querySelector("#message");

//주문내역 관련 DOM 요소를 추가
//주문내역 버튼
const fetchOrdersButton = document.querySelector("#fetchOrdersButton");
//테이블의 tbody
const orderHistoryTableBody = document.querySelector("#orderHistoryTableBody");
//메시지
const orderHistoryMessageElement = document.querySelector("#orderHistoryMessage");


document.addEventListener("DOMContentLoaded", () => {
    //목록조회
    fetchProducts();
    //상품추가
    addItemForm.addEventListener("submit", handleAddItem);
    //주문내역 조회
    fetchOrdersButton.addEventListener("click", handleFetchOrders);
}






document.addEventListener("DOMContentLoaded"), () => {
    fetchProducts();
    addItemForm.addEventListener("submit", handleAddItem);
});

async function fetchProducts() {
    itemTableBody.innerHTML = '<tr><td colspan="6">상품 목록 로딩 중...</td></tr>';
    try {
        const products = await apiFetch('/product');
        renderTable(products);
    } catch (error) {
        itemTableBody.innerHTML = '<tr><td colspan="6">상품 목록을 불러올 수 없습니다.</td></tr>';
    }
}

function renderTable(products) {
    itemTableBody.innerHTML = '';
    if (!products || products.length === 0) {
        itemTableBody.innerHTML = '<tr><td colspan="6">등록된 상품이 없습니다.</td></tr>';
        return;
    }
    products.forEach(product => addNewRowToTable(product));
}

function addNewRowToTable(item) {
    const row = itemTableBody.insertRow(0);
    row.insertCell(0).textContent = item.id;
    row.insertCell(1).textContent = item.name;
    row.insertCell(2).textContent = item.stock;
    row.insertCell(3).textContent = item.price;
    row.insertCell(4).textContent = item.createdAt;
    row.insertCell(5).textContent = item.updatedAt;
}

async function handleAddItem(event) {
    event.preventDefault();

    const newProduct = {
        name: document.querySelector("#productName").value,
        stock: parseInt(document.querySelector("#productStock").value),
        price: parseInt(document.querySelector("#productPrice").value)
    };


async function handleFetchOrders(event) {
    event.preventDefault();
    //메시지의 내용을 "주문 내역 로딩 중...";
    //메시지의 글씨색 #007bff;
}


async function handleFetchOrders(){
    
    try {
        //Get 조회 요청을 하여 주문 내역 데이터 받기
        const orders = await apiFetch('/orders/total');
        //renderOrderHistoryTable(데이터); : 데이터를 받아서 테이블에 넣어주는 역할
        renderOrderHistoryTable(orders);

        orderHistoryMessageElement.textContent = `총 ${orders.length}건의 주문 내역이 조회되었습니다.`;
        orderHistoryMessageElement.style.color = '#28a745';

    } catch (error) {
    orderHistoryTableBody.innerHTML = '<tr><td colspan="5">주문 내역을 불러올 수 없습니다. 서버상태를 확인해주세요</td></tr>';
       orderHistoryMessageElement.textContent = `주문내역 조회 오류: ${error.message}`;
       orderHistoryMessageElement.style.color = 'red';
    }
}

function renderOrderHistoryTable(orders){
    //orders에 내용이 없다면 "등록된 주문 내역이 없습니다."
    
    if(!orders || orders.length === 0){
        orderHistoryTableBody.innerHTML = '<tr><td colspan="5">등록된 주문 내역이 없습니다.</td></tr>';
        return;
    }




    //최신 주문 내역이 위에 오도록 데이터를 추가
    
    orders.forEach((order) => {
        const row = orderHistoryTableBody.insertRow(0);
        //상품이름

// 1. 단일 선택 라디오 버튼
    const radioCell = row.insertCell(0);
    const radio = document.createElement('input');
    radio.type = 'radio';
    radio.name = 'selectedProduct'; // 모든 라디오 버튼이 같은 그룹에 속하게 함
    radio.value = item.productId; // 상품 ID를 값으로 설정
    radioCell.appendChild(radio);

    // 2. 주문 개수 입력 필드
    const orderCountCell = row.insertCell(1);
    const orderInput = document.createElement('input');
    orderInput.type = 'number';
    orderInput.min = '1';
    orderInput.id = `orderCount-${item.productId}`; // 상품 ID로 고유 ID 부여
    orderInput.classList.add('order-count-input');
    orderInput.placeholder = '개수';
    orderInput.disabled = true; // 기본 비활성화
    orderInput.style.width = '60px';
    orderCountCell.appendChild(orderInput);
    
    // 3. 상품 정보 (총 8개의 셀을 맞추기 위해 인덱스 조정)
    row.insertCell(2).textContent = item.productId;
    row.insertCell(3).textContent = item.productName;
    row.insertCell(4).textContent = item.productStock;
    row.insertCell(5).textContent = item.productPrice;
    row.insertCell(6).textContent = item.registerDate;
    row.insertCell(7).textContent = item.updateDate;
        

    //메시지 "주문 내역 로딩 중..."
    //글씨색 #007bff;

    //tbody 내부에 주문내역을 불러오는 중입니다...

    const orderButton = document.querySelector("#orderButton");
    const orderMessageElement = document.querySelector("#orderMessage");

    const ProductId = selectedRadio.value;
    const orderInput = document.querySelector(`#orderCount-${ProductId}`);
    const orderCount = parseInt(orderInput.10); //입력한 개수를 숫자로 변환
    
    //진짜 숫자를 입력했는지, 음수를 입력했는지 조사
    if(isNaN(orderCount) || orderCount <= 0){
        orderMessageElement.textContent = '유효한 주문 개수를 입력해주세요(1이상)';
        orderMessageElement.style.color = 'orange';
        return;

}

    const orderData = {
        productId: ProductId,
        productCount: productCount
    };


    orderMessageElement.textContent = '주문 처리중...';
    orderMessageElement.style.color = '#007bff';
    try {
        await apiFetch('/orders', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(orderData)
        });



    messageElement.textContent = '등록중...',
    messageElement.style.color = '#007bff',

    try {
        await apiFetch('/product', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(newProduct)
        });

        await fetchProducts();
        addItemForm.reset();
        messageElement.textContent = `상품 "${newProduct.name}" 등록 성공!`;
        messageElement.style.color = '#28a745';

    } catch (error) {
        messageElement.textContent = `오류: ${error.message}`;
        messageElement.style.color = 'red';
    }
}