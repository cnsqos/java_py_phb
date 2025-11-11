//jsonplaceholder를 이용한 CRUD

const API = 'https://jsonplaceholder.typicode.com/posts';

//HTML에서 요소를 미리 가져온다.

//게시글 목록이 렌더링 될 ul태그
const postsEl = document.querySelector("#posts");

//글 작성/수정에 사용하는 form태그
const form = document.querySelector("#postForm");

//제목을 입력하는 Input태그
const titleInput = document.querySelector("#title");

//내용을 입력하는 Input태그
const bodyInput = document.querySelector("#body");

//작성버튼
const submitBtn = document.querySelector("#submitBtn");

//수정 모드일때만 사용되는 hidden Input
const postInput = document.querySelector("#postId");

//수정 취소 버튼
const cancelBtn = document.querySelector("#cancelBtn");

//새로고침 버튼
const refreshBtn = document.querySelector("#refreshBtn");

//더보기
const loadMoreBtn = document.querySelector("#loadMoreBtn")

//목록 로딩 시 보여줄 로딩UI(스피너)
const listLoader = document.querySelector("#listLoader");

const formLoader = document.querySelector("#formLoader")

let page = 1;
const LIMIT = 10;
let loading = false;

//setLoading
//간단한 로더 표시 토글 함수
//실제로는 hidden 클래스를 제거/추가해 요소를 보이거나 숨긴다.
//el : 로딩 요소
//on : 로딩 여부
function setLoading(el,on){
    if(on){
        el.classList.remove('hidden');
    } else{
        el.classList.add('hidden');
    }
}



//게시물 목록을 불러와 렌더링한다.
//로딩중이면 중복 호출을 막고, 에러 발생 시 사용자에게 알린다.
//성공하면 renderPosts에 데이터를 넘긴다.
async function fetchPosts(){
  if(loading) return;
  loading = true; setLoading(listLoader, true);
  try{
    const res = await fetch(`${API}?_page=${page}&_limit=${LIMIT}`);
    if(!res.ok) throw new Error('목록 불러오기 실패');
    const data = await res.json();
    renderPosts(data);
    page++;
  }catch(err){
    console.error(err); alert('목록을 불러오는 중 오류가 발생했다');
  }finally{
    loading = false; setLoading(listLoader, false);
  }
}

function renderPosts(items){
  if(page === 1) postsEl.innerHTML = '';
  if(items.length === 0){
    postsEl.insertAdjacentHTML('beforeend', `<li class="item"><div class="meta muted">더 이상 게시물이 없습니다</div></li>`);
    loadMoreBtn.disabled = true;
    return;
  }
  for(const p of items){
    const li = document.createElement('li');
    li.className = 'item';
    li.innerHTML = `
      <div style="width:36px;height:36px;border-radius:6px;background:#eef8ff;display:flex;align-items:center;justify-content:center;color:var(--accent);font-weight:700">${p.id}</div>
      <div style="flex:1">
        <div class="meta">작성자: ${p.userId} · ID: ${p.id}</div>
        <div class="title">${p.title}</div>
        <div class="body" style="white-space:pre-wrap">${p.body}</div>
      </div>
      <div class="actions">
        <button data-id="${p.id}" class="editBtn muted">수정</button>
        <button data-id="${p.id}" class="delBtn" style="background:#fee2e2;color:#7f1d1d">삭제</button>
      </div>
    `;
    postsEl.appendChild(li);
  }
  // 이벤트 위임보다 간단히 버튼 바인딩
  //document.querySelectorAll('.editBtn').forEach(b => b.onclick = onEdit);
  //document.querySelectorAll('.delBtn').forEach(b => b.onclick = onDelete);
}

fetchPosts();