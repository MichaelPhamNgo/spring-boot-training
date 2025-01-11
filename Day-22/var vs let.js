function calculate(vip) {
    var amount = 0;

    if (vip) {
        var amount = 1;
    }

    {
        var amount = 100;
        {
            var amount = 1000;
        }
    }

    return amount;
}

function calculate2(vip) {
    let amount = 0;

    if (vip) {
        let amount = 1;
    }

    {
        let amount = 100;
        {
            let amount = 1000;
        }
    }

    return amount;
}

console.log(calculate(true));
console.log(calculate2(true));