import App from './App.svelte'

interface ipt {
    x: string;
}

export class Foo {
    makeMe(x) {
        console.log(x);
        const z: ipt = {
            x: x.x().z()
        };
        const {html} = (App as any).render({
            ipt: z
        })
        return html;
    }
}