# Phát triển ứng dụng Web 2
- Tên sinh viên: Đỗ Xuân Trường
- MSSV: 64132775
- Email: truong.dx.64cntt@ntu.edu.vn

## Danh mục các bài tập
1. [Bài tập 1: About Me](https://github.com/Truongdoxuan/64132775_Web2?tab=readme-ov-file#b%C3%A0i-t%E1%BA%ADp-1-about-me---gi%E1%BB%9Bi-thi%E1%BB%87u-v%E1%BB%81-t%C3%B4i)
2. [Bài tập 2: BMI](https://github.com/Truongdoxuan/64132775_Web2/tree/main?tab=readme-ov-file#b%C3%A0i-t%E1%BA%ADp-2-bmi---t%C3%ADnh-ch%E1%BB%89-s%E1%BB%91-bmi-c%C6%A1-th%E1%BB%83)
3. [Bài tập 3: Login](https://github.com/Truongdoxuan/64132775_Web2/tree/main?tab=readme-ov-file#b%C3%A0i-t%E1%BA%ADp-3-login---%C4%91%C4%83ng-nh%E1%BA%ADp-v%C3%A0-hi%E1%BB%83n-th%E1%BB%8B-profile-c%C3%A1-nh%C3%A2n)
4. [Bài tập 4: Login - Truyền dữ liệu sang View (String Boot)](https://github.com/Truongdoxuan/64132775_Web2/tree/main?tab=readme-ov-file#b%C3%A0i-t%E1%BA%ADp-4-login---truy%E1%BB%81n-d%E1%BB%AF-li%E1%BB%87u-sang-view-string-boot)
5. [Bài tập 5: BMI - Truyền dữ liệu sang View (String Boot)](https://github.com/Truongdoxuan/64132775_Web2/tree/main?tab=readme-ov-file#b%C3%A0i-t%E1%BA%ADp-5-bmi---truy%E1%BB%81n-d%E1%BB%AF-li%E1%BB%87u-sang-view-string-boot)
6. [Bài tập 6: Tổng hợp ôn tập giữa kỳ (Spring Boot)](https://github.com/Truongdoxuan/64132775_Web2/tree/main?tab=readme-ov-file#b%C3%A0i-t%E1%BA%ADp-6-t%E1%BB%95ng-h%E1%BB%A3p-%C3%B4n-t%E1%BA%ADp-gi%E1%BB%AFa-k%E1%BB%B3-spring-boot)
   
## Bài tập 1: About Me - Giới thiệu về tôi

**Mô tả:** Xây dựng servlet AboutMe, thực hiện yêu cầu khi client gửi GET request http://localhost/AboutMe và sau đó Servlet gửi đáp ứng các thông tin cá nhân của mình.

- **Đường dẫn:** [About Me](https://github.com/Truongdoxuan/64132775_Web2/tree/main/AboutMe)
- **Main file:** [AboutMe.java](AboutMe/src/main/java/truongdx/exercise1_3/AboutMe.java)

![image](https://github.com/user-attachments/assets/fab58531-b6d2-4e80-9d04-3d9222cf6a97)

## Bài tập 2: BMI - Tính chỉ số BMI cơ thể

**Mô tả:** Xây dựng servlet BMI, thực hiện yêu cầu khi client gửi GET request: http://localhost/BMI thì trả về trang web chứa form nhập Chiều cao, Cân nặng, nút Submit. Khi client nhấn nút submit (để gửi POST request) thì Servlet BMI lấy dữ liệu, thực hiện tính toán và gửi trả các thông tin cần thiết.

- **Đường dẫn:** [BMI](https://github.com/Truongdoxuan/64132775_Web2/tree/main/BMI)
- **Main file:** [BMI.java](BMI/src/main/java/truongdx/exercise1_4/BMI.java)

![image](https://github.com/user-attachments/assets/0bb5dd45-01f5-4f1b-b1cb-a8d9b392d80c)
![image](https://github.com/user-attachments/assets/7a843f4f-bcdd-451e-9d4e-68bb0b79c8c9)

## Bài tập 3: Login - Đăng nhập và hiển thị profile cá nhân 

**Mô tả:** Thiết kế 2 file Login.html và Login.jsp để nhận dữ liệu được submit (post) từ trang Login.html. Nếu tên đăng nhập = ABC, mật khẩu bằng MNK thì, đến trang UserProfile và ngược lại đến trang Login

- **Đường dẫn:** [Login](https://github.com/Truongdoxuan/64132775_Web2/tree/main/Login)
- **Main file:**
  + [Login.html](Login/src/main/webapp/Login.html)
  + [Login.jsp](Login/src/main/webapp/Login.jsp)
  + [UserProfile.html](Login/src/main/webapp/UserProfile.html)

![image](https://github.com/user-attachments/assets/62d57523-e0cf-43c7-ac64-9db4d0c17c3c)
![image](https://github.com/user-attachments/assets/6ea176b0-17d0-48d0-9aad-cc9a41dd4c60)

## Bài tập 4: Login - Truyền dữ liệu sang View (String Boot)
**Mô tả:** 

a ) Tạo dự án String Boot, truyền dữ liệu: MSSV, Họ tên SV, năm sinh, giới tính từ Controller -> View và hiển thị tại View.

b) Tạo 1 model sinh viên và thiết kế dữ liệu danh sách sinh viên và truyền đến View để hiển thị. 

c)  Thiết kế View Login truyền dữ liệu đã nhập vào để đăng nhập. Nếu đăng nhập thành công thì chuyển hướng đến View Profile.

- **Đường dẫn:** [SB_TruyenDuLieuSangView](SB_TruyenDuLieuSangView)
- **Main file:**
  + [TruyenDuLieuController.java](SB_TruyenDuLieuSangView/src/main/java/truongdx/baitap/SB_TruyenDuLieuSangView/TruyenDuLieuController.java)
  + [Model_SinhVien.java](SB_TruyenDuLieuSangView/src/main/java/truongdx/baitap/SB_TruyenDuLieuSangView/SinhVien.java)
  + [LoginController.java](SB_TruyenDuLieuSangView/src/main/java/truongdx/baitap/SB_TruyenDuLieuSangView/LoginController.java)
  + [StudentProfile.html](SB_TruyenDuLieuSangView/src/main/resources/templates/studentView.html)
  + [dsSinhVienView.html](SB_TruyenDuLieuSangView/src/main/resources/templates/dsSinhVienView.html)
  + [LoginView.html](SB_TruyenDuLieuSangView/src/main/resources/templates/login.html)

![image](https://github.com/user-attachments/assets/bd5493dd-5152-4823-b5e9-33c498cf62cb)
![image](https://github.com/user-attachments/assets/e2553727-e6fa-4821-9cd9-386316a1e1bc)

## Bài tập 5: BMI - Truyền dữ liệu sang View (String Boot)
**Mô tả:** Tạo dự án String Boot, truyền dữ liệu: chiều cao, cân nặng từ Controller -> View và hiển thị kết quả chỉ số BMI của bạn tại View.
- **Đường dẫn:** [SB_BMI](SB_BMI)
- **Main file:**
  + [BMI_Controller.java](SB_BMI/src/main/java/truongdx/baitap/SB_BMI/BMI_Controller.java)
  + [BMI_Form.html](SB_BMI/src/main/resources/templates/bmi.html)
  + [BMI_Result](SB_BMI/src/main/resources/templates/result.html)

  ![image](https://github.com/user-attachments/assets/7d4d1729-6fdf-4d7c-9688-d0de37b7a092)
  ![image](https://github.com/user-attachments/assets/a5cca0f7-76f5-4b6b-bbd5-1884f9693da7)

## Bài tập 6: Tổng hợp ôn tập giữa kỳ (Spring Boot)
**Mô tả:** Tạo dự án String Boot, xây dựng Model, Controller truyền dữ liệu nhiều thông tin sinh viên sang View và xây dựng form thêm thông tin sinh viên truyền thông tin từ View ngược về Controller: Thiết kế View để hiển thị kết quả dưới dạng danh sách.
- **Đường dẫn:** [TongHopGK](TongHopGK)
- **Main file:**
  + [Controller.java](TongHopGK/src/main/java/truongdx/baitap/TongHopGK/Controllers)
  + [SinhVien.java](TongHopGK/src/main/java/truongdx/baitap/TongHopGK/Models/SinhVien.java)
  + [about.html](TongHopGK/src/main/resources/templates/views/about.html)
  + [addnew.html](TongHopGK/src/main/resources/templates/views/addnew.html)
  + [home.html](TongHopGK/src/main/resources/templates/views/home.html)
  + [list.html](TongHopGK/src/main/resources/templates/views/list.html)

![image](https://github.com/user-attachments/assets/45076115-60ca-475c-8c5e-a559a97a10d9)
![image](https://github.com/user-attachments/assets/c90b070d-15d3-4643-9d2d-4c45fa4abf9b)
![image](https://github.com/user-attachments/assets/af491d71-44df-4119-89c7-7e246fdc3a96)




