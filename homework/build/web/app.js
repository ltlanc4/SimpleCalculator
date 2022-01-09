const App = (function () {
    function init() {
        document.querySelector("form").addEventListener('click', (event) => {
            event.preventDefault();
            if (event.target.classList.contains("basic-calculator-btn")) {
                let newElement = document.createElement("div");
                document.querySelector("#cal").classList.add("d-none");
                document.querySelector("#lin").classList.add("d-none");
                document.querySelector("#quad").classList.add("d-none");
                newElement.innerHTML = `<div class="return">
                    ←
                    <button class="icon-return" id="return">Retu</button>
                </div>
                <div class="basic-position-input">
                    Number 1:
                    <input class="basic-calculator-input" type="number" name="num1" />
                    <br>
                    <br>
                    Number 2:
                    <input class="basic-calculator-input" type="number" name="num2" />
                </div>
                <div class="basic-position-button">
                    <input class="basic-calculator" type="submit" name="cal" value="Add" />
                    <input class="basic-calculator" type="submit" name="cal" value="Sub" />
                    <input class="basic-calculator" type="submit" name="cal" value="Mul" />
                    <input class="basic-calculator" type="submit" name="cal" value="Div" />
                </div>`
                document.querySelector('form').appendChild(newElement);
            }
        });
    }
    return {
        init,
    };
})();

window.addEventListener("DOMContentLoaded", App.init);