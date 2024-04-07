import axios from "axios"

export const api = axios.create({
    baseURL : "http://localhost:8081"
})

/* This func adds a new room to the DB */
export async function addRoom(photo, roomType, roomPrice){
    const formData = new FormData();
    formData.append("photo", photo);
    formData.append("roomType", roomType);
    formData.append("roomPrice", roomPrice);

    const response = await api.post("/rooms/add/new-room", formData);
    if(response.status == 201){
        return true;
    }
    else{
        return false;
    }
}

/* This func gets all room types from DB */
export async function getRoomType(){
    try{
        const response = await api.get("/rooms/room-types");
        return response.data;
    }
    catch(error){
        throw new Error("Error fetching room types");
    }
}