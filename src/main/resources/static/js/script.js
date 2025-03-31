console.log("Script loaded");

document.addEventListener('DOMContentLoaded', () => {
  const themeButton = document.getElementById('theme_change_button');

  function changeTheme() {
    const html = document.documentElement;
    const currentTheme = localStorage.getItem('theme') || 'light';

    if (currentTheme === 'dark') {
      html.classList.remove('dark');
      themeButton.innerHTML = '<i class="fa-solid fa-circle-half-stroke"></i><span>Light</span>';
      localStorage.setItem('theme', 'light');
    } else {
      html.classList.add('dark');
      themeButton.innerHTML = '<i class="fa-solid fa-circle-half-stroke"></i><span>Dark</span>';
      localStorage.setItem('theme', 'dark');
    }
  }

  (function setInitialTheme() {
    const currentTheme = localStorage.getItem('theme') || 'light';
    const html = document.documentElement;

    if (currentTheme === 'dark') {
      html.classList.add('dark');
      themeButton.innerHTML = '<i class="fa-solid fa-circle-half-stroke"></i><span>Dark</span>';
    } else {
      html.classList.remove('dark');
      themeButton.innerHTML = '<i class="fa-solid fa-circle-half-stroke"></i><span>Light</span>';
    }
  })();

  themeButton.addEventListener('click', changeTheme);
});

