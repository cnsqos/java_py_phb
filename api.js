// export const BASE_URL = 'http://localhost:8080';

// // 범용 API fetch 함수 응답상태를 확인하고, JSON데이터를 파싱하여 반환
// export async function apiFetch(endpoint,options = {}){
//     const url = BASE_URL + endpoint;
//     try {
//         //fetch() 요청을 한다.
//         const response = await fetch(url, options);
        
//         //응답 본문을 JSON으로 파싱한다.
//         const result = await response.json();
        
//         //response.ok -> 통신이 성공하면 true를 반환, 4xx,5xx에러를 반환하면 false를 반환
//         //http 상태코드가 200이 아니면 에러로 처리
//         //errorMessage에는 서버에서 보낸 에러 문구를 넣어주시면 됩니다.
//         //throw new Error(errorMessage);
//         if(!response.ok){
//             //ResponseDTO의 error 필드에 담긴 메시지를 꺼낸다.
//             const errorMessage = result.error;
//             //통신이 잘 되지 않으면 예외를 발생시킨다.
//             throw new Error(errorMessage);
//         }

//         //성공 시 응답DTO의 data필드를 반환
//         return result.data;

//     } catch (error) {
//         console.error("API 호출 중 오류 발생 : " + error.message);
//         throw error; //함수를 호출한쪽에서 예외를 처리
//     }
// }


export const BASE_URL = 'http://localhost:8080';

export async function apiFetch(endpoint, options = {}) {
    const url = BASE_URL + endpoint;
    try {
        const response = await fetch(url, options);
        const result = await response.json();

        if (!response.ok) {
            throw new Error(result.error || "서버 오류");
        }
        return result.data;
    } catch (error) {
        console.error("API 호출 오류:", error.message);
        throw error;
    }
}
