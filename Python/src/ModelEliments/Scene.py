from model_elements.camera import Camera
from model_elements.flash import Flash
from model_elements.poligon import Poligon


class Scene[T]:
    def init(
        self, models: list[Poligon], flashes: list[Flash], cameras: list[Camera]
    ) -> None:
        self.id: int = 0
        self.models: list[Poligon] = models
        self.flashes: list[Flash] = flashes

    def method1(self, object: T) -> T:
        return object

    def method2(self, object1: T, object2: T) -> T:
        return object1