// jsonplaceholder를 이용한 CRUD

const API = 'https://jsonplaceholder.typicode.com/posts';

// HTML에서 요소를 미리 가져온다.

// 게시글 목록이 렌더링 될 ul태그
const postEl = document.querySelector('#posts');

// 글 작성/수정에  사용하는 form태그
const form = document.querySelector('#postForm');

// 제목을 입력하는 Input태그
const titleInput = document.querySelector('#title');

// 내용을 입력하는 Input태그
const bodyInput = document.querySelector('#body');

// 작성버튼
const submitBtn = document.querySelector('#submitBtn');

// 수정모드 일때만 사용되는 hidden input
const postInput = document.querySelector('#postId');

// 수정 취소 버튼
const cancelBtn = document.querySelector('#cancelBtn');

// 새로고침 버튼
const refreshBtn = document.querySelector('#refreshBtn');

// 더보기
const loadMoreBtn = document.querySelector('#loadMoreBtn');

// 목록 로딩 시 보여줄 로딩UI(스피너)
const listLoader = document.querySelector('#listLoader');

const formLoader = document.querySelector('#formLoader');

let page = 1;
const limit = 10;
let loading = false;
// 현재 로딩중인지 여부


// setLoading
// 간단한 로더 표시 토글 함수
// 실제로는 hidden 클래스를 제거/추가해 요소를 보이거나 숨긴다.
// el: 로딩 요소
// on: 로딩 여부

function setLoading(el,on) {
    if(on){
        el.classList.remove('hidden');
    } else {
        el.classList.add('hidden');
    }
}

// 게시물 목록을 불러와 렌더링한다
// 로딩중이면 중복 호출을 막고, 에러 발생 시 사용자에게 알린다
// 성공하면 renderPosts에 데이터를 넘긴다.
async function fetchPosts() {

    if(loading){ // 로딩중이면 실행하지 않는다.
        return;
    }
    
    loading = true;
    setLoading(listLoader, true); //로딩 표시


    try { //에러가 발생할 가능성이 있는 코드
        const res = await fetch(`${API} '?_page=${page}&_limit=${LIMIT}`);

        if(!res.ok){
            throw new Error("목록 불러오기 실패");      
        }
        // 데이터를 json으로 변환해서 renderPosts()함수의 인수로 전달
        const data = await res.json();
        renderPosts(data);
        page++;
    } catch (err) { //에러가 발생하면 실행할 코드
        console.error(err);
        alert("목록을 불러오는 중에 오류가 발생했습니다.");
    } finally { //에러 발생 여부와 상관없이 무조건 실행되는 코드
        loading = false;
        setLoading(listLoader, false);
    }   
}

function renderPosts(items){
    if(page === 1){
        postEl.innerHTML = ''; //초기 로드거나 새로고침일 때 기존 목록 제거
    }
    // 더 이상 로드할 항목이 없는 경우 사용자에게 알림을 표시하고 더보기 버튼을 비활성화
    if(items.length === 0){
        // ul 태그에 소괄호에 있는 내용을 삽입해라
        // beforeend : 선택한 요소 안쪽에서 맨뒤
        postEl.insertAdjacentElement('beforeend',`<li class=item><div class="meta muted">더이상 게시물이 없습니다.</div></li>`);
        loadMoreBtn.disabled=true;
        return;
    }
    // 각 게시물을 생성
    for(const item of items){
        // li요소를 만들겠다.
        const li = document.createElement('li');
        li.className = 'item';
        li.innerHTML = `
            <div style="width:36px;height:36px;border-radius:6px;background:#eef8ff;display:flex;align-items:center;justify-content:center;color:var(--accent);font-weight:700">${p.id}</div>
            <div style="flex:1">
            <div class="meta">작성자: ${p.userId} · ID: ${p.id}</div>
            <div class="title">${escapeHtml(p.title)}</div>
            <div class="body" style="white-space:pre-wrap">${escapeHtml(p.body)}</div>
            </div>
            <div class="actions">
            <button data-id="${p.id}" class="editBtn muted">수정</button>
            <button data-id="${p.id}" class="delBtn" style="background:#fee2e2;color:#7f1d1d">삭제</button>
            </div>`

            postEl.appendChild(li);
        }
    }

    fetchPosts